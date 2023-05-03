package DataStructures;

import java.util.*;

public class HashTableExample {
    public static void main(String args[])
    {
        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(123, 432);
        ht.put(12, 2345);
        ht.put(15, 5643);
        ht.put(3, 321);

        ht.remove(12);
        for(Map.Entry k: ht.entrySet()) {
            System.out.println(k.getKey() + " "+k.getValue());
        }
//        System.out.println(ht);
    }
}