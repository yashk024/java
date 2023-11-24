package tests.datastructures.hashmap;

import com.datastructures.hashmap.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap hashTable = new HashMap();

        hashTable.put("nails", 100);
        hashTable.put("nails", 100);
        hashTable.put("tile", 50);
        hashTable.put("lumber", 80);
        hashTable.put("paint", 20);

        hashTable.put("bolts", 200);
        hashTable.put("screws", 140);

        hashTable.printTable();

        System.out.println(hashTable.get("bolts"));
        System.out.println(hashTable.get("hammer"));

        System.out.println(hashTable.getKeys());

        System.out.println(hashTable);
    }

}
