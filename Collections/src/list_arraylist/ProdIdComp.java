package list_arraylist;

import java.util.Comparator;

public class ProdIdComp implements Comparator<Flipkart>
{
    int status;
    // this is a generic comparator
    @Override
    public int compare(Flipkart f1, Flipkart f2) {
        // logic
        if(f1.prodId== f2.prodId){
             status=0;
        } else if (f1.prodId> f2.prodId) {
             status=1;
        } else if (f1.prodId< f2.prodId) {
             status=-1;
        }

        return status;
    }


    // normal comparator witout generic implementation
//    public int compare(Object o1, Object o2) {
//        // downcast karte hai in our object
//        Flipkart f1 =(Flipkart)o1;
//        Flipkart f2=(Flipkart) o2;
//        return 0;
//    }
}
