package main;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetAndHash {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Walter");
        names.add("John");
        for (String name: names) {
            System.out.println(name);
        }
        names.forEach(System.out::println);
        Iterator<String> itnames = names.iterator();
        while(itnames.hasNext()){
            System.out.println(itnames.next());
        }
    }
}