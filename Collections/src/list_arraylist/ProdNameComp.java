package list_arraylist;

import java.util.Comparator;

public class ProdNameComp implements Comparator<Flipkart>{
    @Override
    public int compare(Flipkart f1, Flipkart f2) {

        // if we did introduce status
        // int status=
        return f1.prodName.compareTo(f2.prodName);
    }
}
