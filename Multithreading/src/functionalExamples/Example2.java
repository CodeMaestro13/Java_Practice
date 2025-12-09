package functionalExamples;

import java.util.Arrays;
import java.util.List;

// lambda for shortcut
//foreach(System.out::println);

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(23,54,34,64,43,44,23,31,13);
//        numbers.forEach(n-> System.out.println(n));
        numbers.forEach(System.out::println);
    }

}
