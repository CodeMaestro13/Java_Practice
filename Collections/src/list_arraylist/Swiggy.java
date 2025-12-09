package list_arraylist;

public class Swiggy implements Comparable {
    int status;
    int itemId;
    String itemName;

    Swiggy(int itemId, String itemName){
        this.itemId=itemId;
        this.itemName=itemName;
    }

    // for based on itemName
    @Override
    public int compareTo(Object o){
        // type case krav lagel
        Swiggy s= (Swiggy) o;
        return itemName.compareTo(s.itemName);
    }


    // based on the itemId for sorting
//    @Override
//    public int compareTo(Object o) {
//        // convert it into the Swiggy object
//        Swiggy s = (Swiggy)o;
//        if(itemId==s.itemId){
//            status=0;
//        } else if (itemId<s.itemId) {
//            status=-1;
//
//        } else if (itemId>s.itemId) {
//            status=1;
//        }
//        return status;
//    }
    //@override is annotation
}

// points :- How do compareTO method works internally with string
// "Cyber" --> it will check each character unicode value and if both are same then compare next char
// "Cyber" -->

// finally if all the unicode values are same then===> return 0 (By this we can say that both the strings are same)

// when + and when -??
// + --> if first string unicode value is greater and other is smaller ex:- Cyber , Amber [C-A] i.e [99-97]--> +ve
// - --> for vise varsa i.e [C-A] ==> -ve negative