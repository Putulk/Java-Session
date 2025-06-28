package com.company.map;

import java.util.*;

public class HashMapPractice{
    public static void main(String[] args){
        /* Write a Java program to associate the specified value with the specified key in a HashMap */
        HashMap<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("11", "Putul");
        stringStringMap.put("21", "Shabu");
        stringStringMap.put("25", "Amit");
        stringStringMap.put("28", "Aman");
        stringStringMap.put("27", "Ashutosh");

        System.out.println("Map Data: "+stringStringMap);

        /* Write a Java program to count the number of key-value (size) mappings in a map */
        int count = stringStringMap.size();
        System.out.println("\nSize or count of key-value pair in hashmap: "+count);

        /* Write a Java program to copy all of the mappings from the specified map to another map */
        Map<String, String> copiedMap = new HashMap<>();
        copiedMap.put("90", "Seema");
        copiedMap.put("60", "Munni");
        copiedMap.putAll(stringStringMap);
        System.out.println("\nCopied Map data from previous map: "+copiedMap);

         /* Write a Java program to remove all of the mappings from a map. */
        copiedMap.clear();
        System.out.println("\nRemoving all the data from copied map : "+copiedMap);

        /* Write a Java program to check whether a map contains key-value mappings (empty) or not. */
        if(!stringStringMap.isEmpty()){
            System.out.println("\nMap is not empty. Map have data : "+stringStringMap);
        }
        else
            System.out.println("\nMap is empty.");

        // Check for copied map
        if(!copiedMap.isEmpty()){
            System.out.println("\nMap is not empty. Map have data : "+copiedMap);
        }
        else
            System.out.println("\nMap is empty.");

        /* Write a Java program to get a shallow copy of a HashMap instance. */
        Map<String, String> shallowCopyMap = new HashMap<>();
        shallowCopyMap =(Map<String, String>)stringStringMap.clone();
        System.out.println("\nShallow copy of the previous map is : "+shallowCopyMap);

        /* Write a Java program to test if a map contains a mapping for the specified key. */
        if(stringStringMap.containsKey("11")){
            System.out.println("\nAssociated value of key 11: "+stringStringMap.get("11"));
        }

        /* Write a Java program to test if a map contains a mapping for the specified value. */
        if(stringStringMap.containsValue("Putul")){
            System.out.println("\nMap contains a mapping for the specified value -> Putul: ");
        }
        else
            System.out.println("\nNo mapping found for specified value -> Putul");

        if(stringStringMap.containsValue("Neeraj")){
            System.out.println("\nMap contains a mapping for the specified value -> Neeraj: ");
        }
        else
            System.out.println("\nNo mapping found for specified value -> Neeraj");

        /* Write a Java program to create a set view of the mappings contained in a map. */
        Set hashMapSet = stringStringMap.entrySet();
        System.out.println("\nSet view of a mappings contained in a map: "+hashMapSet);

        /* Write a Java program to get a set view of the keys contained in this map. */
        Set<String> setViewOfMapKeys = stringStringMap.keySet();
        System.out.println("\nSet view of the keys contained in this map: "+setViewOfMapKeys);

        /* Write a Java program to get a collection view of the values contained in this map. */
        Collection valuesOfMap = stringStringMap.values();
        System.out.println("\nCollection view of the values contained in this map : "+valuesOfMap);
    }
}
