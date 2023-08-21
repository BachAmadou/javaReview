package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class CalculateTest {
    public static void main(String[] args) {

        // Reference to static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(20, 10);
        System.out.println(s1);

        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        // Reference to instance method
        Calculate m1 = (x, y) -> new Calculator().findMultiply(x, y);
        m1.calculate(3, 6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(4, 5);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(3, 3);

        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("Developer", 6));

        BiFunction<String, Integer, String> fn2 = String::substring;
        System.out.println(fn2.apply("Developer", 6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(30);
    }
}













