package main.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingJavaStreams {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Alice",null,"Bob",null,"Charlie");
        System.out.println(removeNull(names));
    }
    public static List<String> removeNull(List<String> names){
        List<String> nonNullNames = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
        return nonNullNames;
    }
}
