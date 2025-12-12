package maps_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// how we are extracting the data from the HashMap
public class HashMap4 {
    public static void main(String[] args) {
        HashMap hs1= new HashMap();
        hs1.put(101,"Krishna");
        hs1.put(202,"Shekhar");
        hs1.put(303,"Narade");
        hs1.put(404,"SDE at Google Software Engineer");

        // to extract it we need to convert it to set
        Set s=hs1.keySet();
        // now on set we can perform the operations
        Iterator i= s.iterator();
        // same as before we are iterating into the other collections
        while(i.hasNext()){
            // for extracting the data we have to use the Map.entry
            // Map.entry is a type we are typecasting our datainto it

//            Map.entry mp=(Map.entry)i.next(); --> not valid
            Map.Entry mp=(Map.Entry)i.next(); // it is properly type casted
            System.out.println(mp.getKey()+ " -- "+ mp.getValue());
        }
    }

}

//points:-- to extract data form the map we dont have any direct method why because it have two objects so
// for extracting the data we firslty have to convert the map to the set and then apply iterator on it.
