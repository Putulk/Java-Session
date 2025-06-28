package com.company.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice{
    public static void main(String[] args){
        /* Write a Java program to associate the specified value with the specified key in a Tree Map. */
        TreeMap<Integer, String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put(1, "putul");
        stringTreeMap.put(2, "amit");
        stringTreeMap.put(3, "shabu");
        stringTreeMap.put(4, "aman");
        stringTreeMap.put(5, "ashutosh");

        System.out.println("Treemap data: "+stringTreeMap);

        for(Map.Entry<Integer, String> entry: stringTreeMap.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

        /* Write a Java program to copy a Tree Map content to another Tree Map. */
        TreeMap<Integer, String> copiedTeeMap = new TreeMap<>();
        copiedTeeMap.put(11, "cse");
        copiedTeeMap.put(12, "ece");
        System.out.println("\nCopied map before copying another map : "+copiedTeeMap);
        copiedTeeMap.putAll(stringTreeMap);

        System.out.println("\nCopied map before copying another map : ");
        for(Map.Entry<Integer, String> entry: copiedTeeMap.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }

        /* Write a Java program to search a key in a Tree Map. */
        if(copiedTeeMap.containsKey(3)){
            System.out.println("\nKey with associated value: "+ copiedTeeMap.get(3));
        }else {
            System.out.println("\nKey not present in tree-map");
        }

        if(copiedTeeMap.containsKey(13)){
            System.out.println("\nKey with associated value: "+ copiedTeeMap.get(13));
        }else {
            System.out.println("\nKey not present in tree-map");
        }

        /* Write a Java program to search a value in a Tree Map. */
        if(copiedTeeMap.containsValue("putul")){
            System.out.println("\nValue present in map");
        }else {
            System.out.println("\nValue not present in tree-map");
        }

        if(copiedTeeMap.containsValue("Prema")){
            System.out.println("\nValue present in map");
        }else {
            System.out.println("\nValue not present in tree-map");
        }

        /* Write a Java program to get all keys from the given a Tree Map. */
        for(Map.Entry<Integer, String> stringEntry : copiedTeeMap.entrySet()){
            System.out.println("Keys present in given tree map : "+stringEntry.getKey());
        }

        /* Write a Java program to delete all elements from a given Tree Map. */
        stringTreeMap.clear();
        System.out.println("After deleting all elements from the map: "+stringTreeMap);

        /* Write a Java program to sort keys in Tree Map by using comparator. */

    }
}
