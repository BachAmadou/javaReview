package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 2, 5, 8);
        int result = numbers.stream().reduce(0,(a,b) -> a + b);
        System.out.println(result);

        // No initial value
        Optional<Integer> result2 = numbers.stream().reduce((a,b) ->  a + b);
        System.out.println(result2);

        // Max, Min and Sum
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min " + min.get());
        System.out.println("Max " + max.get());
        System.out.println("Sum " + sum.get());
    }
}
















