import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AllFunctionsExample {
    public static void main(String[] args) {

        //********************PREDICATE*************************//
        Predicate<Integer> lesserThan = num -> num < 23;
        boolean result = lesserThan.test(45);
        System.out.println(result);

        //********************CONSUMER*************************//
        Consumer<Integer> displayInfo = i -> System.out.println(i);
        displayInfo.accept(30);

        //********************BICONSUMER*************************//
        BiConsumer<Integer, Integer> addTwoNum = (x, y) -> System.out.println(x + y);
        addTwoNum.accept(10, 38);

        //********************FUNCTION*************************//
        Function<String, String> str = word -> "What's up " + word;
        String greet = str.apply("Bach");
        System.out.println(greet);
    }
}



















