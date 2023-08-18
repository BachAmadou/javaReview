package stream;

import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 4, 5, 30, 28, 21 ,21, 47);

        // ToCollection
        System.out.println("*******ToCollection*******");
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        // toList() - returns a Collector interface that gathers the input data into a new list
        System.out.println("**********ToList**********");
        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        // toSet() - returns a Collector interface that gathers the input data into a new set
        System.out.println("**********ToSet**********");
        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        // toMap(function, function) - returns a Collector interface that gathers the input data into a new map
//        System.out.println("**********ToMap**********");
//        Map<String, Integer> dishMap = dishData.getAll().stream()
//                .collect(Collectors.toMap(Dis::getName, Dish::getCalories));
//        System.out.println(dishMap);

        // counting - returns a Collector interface that counts the number of elements
           System.out.println("**********ToMap**********");
           Long evenCount = numbers.stream()
                   .filter(x -> x % 2 == 0)
                   .collect(Collectors.counting());
        System.out.println(evenCount);

        // summingIng(toIntFunction) - returns a Collector interface that produces the sum of an integer-value function
//        System.out.println("**********summingInt**********");
//        Integer sum = DishData.getAll().stream()
//                .collect(Collectors.summingInt(Dish::getCalories));
//        System.out.println(sum);

        // averagingInt(toIntFunction) - returns the average of the integers passed values
//       System.out.println("**********summingInt**********");
//       Double calorieAvg = DishData.getAll().stream()
//               .collect(Collectors.averagingInt(Dish::getCalories));
//        System.out.println(calorieAvg);

        // joining - is used to joining various elements of a character of string array a single string object
        System.out.println("**********Joining**********");
        List<String> courses = Arrays.asList("Java", "JS", "Spring");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        // partitioningBy(): is used to partition a stream of objects(or set of elements) based on a given predicate
//        System.out.println("**********partitioningBy()**********");
//        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
//                .collect(Collectors.partitioningBy(Dish::isVegetarian));
//        System.out.println(veggieDish);

        // groupingBy(): is used to partition a stream of objects(or set of elements) based on a given predicate
//        System.out.println("**********groupingBy()()**********");
////        Map<Type, List<Dish>> dishType = dishData.getAll().stream()
////                .collect(Collectors.groupingBy(Dish::getType));
////        System.out.println(dishType);





    }
}












