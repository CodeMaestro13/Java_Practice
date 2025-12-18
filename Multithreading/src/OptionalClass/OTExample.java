package OptionalClass;

import java.util.Optional;

public class OTExample {
    public static void main(String[] args) {
        String sports[]= new String[10];
        sports[5]="foodball";
        System.out.println(sports[2]);
        // if we change the index the get null as output this is handle by optional class

        Optional<String> khel= Optional.ofNullable(sports[3]);
        if (khel.isPresent()){
            System.out.println(khel);
        }
        else {
            //  System.out.println(khel.orElse("No sports Found"));
            khel.orElseThrow();
        }
    }
}
