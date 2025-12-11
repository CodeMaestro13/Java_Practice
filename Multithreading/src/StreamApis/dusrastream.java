package StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dusrastream {
    public static void main(String[] args) {
        List<Integer> number=
                Arrays.asList(45,4,55,65,64,34,65,34,56,79);

        // sum the all the elements by for loop

        // sum calculation by streams api
        // reduce is the terminal functions

        int total= number.stream().reduce(0,(sum,n)->sum+n);
        System.out.println(total);

        int prod=number.stream().reduce(1,(prd,n)->prd*n);
        System.out.println(prod);

        // if i want to have the even number sum then
        int evenSum=number.stream().filter(n->n%2==0).reduce(0,(sum,n)->sum+n);
        System.out.println(evenSum);

        // collect methods by collect class
        //int total2=number.stream().collect(Collectors.summarizingInt(n->1));


        // what wthat we can do with the Stream apis

        // we can iterate into the array list
        // question
        // h.w
        // generate the fibonachin series using streams -- iterate method() and arrays
    }

}
