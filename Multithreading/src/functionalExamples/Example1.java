package functionalExamples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {

        // supplier
        Supplier<String> sup =() ->{
            String s="Java";
            s=s.concat("Functional Interface");
            return s;
        };

        String result= sup.get();
        System.out.println(result);

        // consuper

        Consumer<Integer> con=(n)-> System.out.println("the number is : "+n);
        con.accept(10234);

        // predicate examples  --it will return boolean by default
        Predicate<Integer> pre = (age)->{
          if(age>=18){
              return true;
          }
          else {
              return  false;
          }
        };
        boolean bool= pre.test(24);
        System.out.println(bool);

        // functional
        // first one-->always parameter and return type is String
        Function<Integer,String> fun = (n)->{
            if(n%2==0){
                return "Even";
            }
            else{
                return "Odd";
            }
        };
        String r=fun.apply(32);
        System.out.println(r);
    }
}
//points:-
// Supplier-->get() --
// Consumer--> accept() --
// predacate-->test() -- 1 parameter
// function--> apply() -- 1 parameter and return type
