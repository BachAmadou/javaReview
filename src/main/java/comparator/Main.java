package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 9, 10, 0, 40, 13, 49, 28, 32, 20);
        System.out.println(list);

        // Sort ascending
        Collections.sort(list);
        System.out.println(list);

        // Sort descending
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        // We can also do it directly without using 'MyComparator'
        Collections.sort(list, ((o1,o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));
        System.out.println(list);

        // Ascending using CompareTo method
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        // Descending using CompareTo method
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        List<Apple> inventory = Arrays.asList(
                new Apple(40, Color.GREEN),
                new Apple(155, Color.RED),
                new Apple(200, Color.GREEN)
        );

        Comparator<Apple> sortApple = comparing((apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing((apple) -> apple.getWeight()));

        inventory.sort(comparing(Apple::getWeight));

        // Reverse
        inventory.sort(comparing(Apple::getWeight).reversed());
        System.out.println(inventory);

        // Chaining
        inventory
                .sort(comparing(Apple::getWeight)
                    .reversed()
                        .thenComparing(Apple::getColor));
        System.out.println(inventory);

    }












}
