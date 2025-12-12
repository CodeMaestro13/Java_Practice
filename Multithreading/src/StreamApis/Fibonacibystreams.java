package StreamApis;

import java.util.stream.Stream;

public class Fibonacibystreams {
    public static void main(String[] args) {
        // how we are making the arrays
        // different ways

        // int arr[]={23}

        // another way of creating array
        // int arr3[]=new int[] {23,34,54,55,12,322,};
        //sout(arr3[2]);

        // with streams
        Stream.iterate(new int[] {0,1} , fib->new int[] {fib[1],fib[0]+fib[1]})
                .map(fib->fib[0])
                .limit(10)
                .forEach(System.out::println);
    }

}
