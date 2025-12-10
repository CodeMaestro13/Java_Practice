package set_Hashset;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet hs1= new HashSet();
        hs1.add('A');hs1.add('B');
        hs1.add('C');hs1.add('D');
        System.out.println(hs1);
        // 2nd hashSet --> adding the one collection into another by
        HashSet hs2= new HashSet(hs1);
        hs2.add(10);
        hs2.add(20);
        System.out.println(hs2);
        HashSet hs3 = new HashSet();
        // 2nd method by
        hs3.addAll(hs2);
        hs3.add("Krishna");
        hs3.add("Kabir");
        System.out.println(hs3);



    }
}
