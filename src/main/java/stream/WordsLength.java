package stream;

import java.util.Arrays;
import java.util.List;

public class WordsLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Apple", "Developer", "Coding", "Taking");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}
