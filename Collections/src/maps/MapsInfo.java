package maps;

public class MapsInfo {
    // Maps Characteristic
    // in list and set collections their we can only store a single objects this problem is solved my map collections
    // Map is used to store the two object at a time

    // 2 objects ===1) key 2) value

    // 1 key-characters
    //--> it will not allow duplicate key(It should be unique)
    //--> it will allow only single NULL --

    // 2 values--Characters
    //-> it should have unique / Duplicate / null values

                            // Map(I) v1.2--> 2 trees
                                //      \\
    // (implements) HashMap(C) v1.2         SortedMap(I) v1.2 (extends)
    //       ||                                      ||
 //          ||                                      ||
//     LinkedHashMap(C) v1.4(extends)           NavigableMap(I)  v1.6 (implements)
//                                                    ||
//                                                    ||
    //                                        TreeMap(C) v1.2 (implements)
}

// HashMap:--Characters

// introduced in version 1.2

// it can accepts both homogeneous and hetrogeneous data

//Insertion  Order is [not maintained]

// Duplicated is not allowed for keys but allowed for values

// null insertions is allowed (only ONCES for keys) and for values it can be more the once

// it is not synchnized

// data structures is based on hashtable

// cursors are not applicable in this

