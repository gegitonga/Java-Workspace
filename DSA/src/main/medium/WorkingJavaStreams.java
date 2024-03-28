package main.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingJavaStreams {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice",null,"Bob",null,"Charlie");
        System.out.println(removeNull(names));

        List<String> fruits = Arrays.asList("apple","banana","orange");
        System.out.println(useCollectingAndThen(fruits));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println();
        dropAndTake(numbers);
    }
    public static List<String> removeNull(List<String> names){
        List<String> nonNullNames = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        return nonNullNames;
    }

    public static Map<Integer, String> useCollectingAndThen(List<String> fruits){
        Map<Integer, String> result =  fruits.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(fruits::indexOf, String::toUpperCase),
                        Collections::unmodifiableMap
                ));
        return result;
    }

    public static void dropAndTake(List<Integer> numbers){
        numbers.stream()
                .dropWhile(n -> n < 3)
                .takeWhile(n -> n < 6)
                .forEach(System.out::println);
    }
}
