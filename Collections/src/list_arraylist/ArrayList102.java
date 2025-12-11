package list_arraylist;
import java.util.Arrays;
import java.util.List;

public class ArrayList102 {
    public static void main(String[] args) {
        String[] a={"Epson","Hp","Lenovo","dell"};
        List<String> l= Arrays.asList(a);
        // asList--> convert the arrays to the collection

        System.out.println(l);
        // extraction
        for(String s:l){
            System.out.println(s);
        }
    }
}
