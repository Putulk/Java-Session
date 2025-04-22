package com.company.javavers8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateFromList{
    public static void main(String[] args){
        List<Integer> dupNumList =Arrays.asList(71, 18, 17, 13, 91, 13, 21, 6, 4, 7, 4, 6);

        List<Integer> uniqueElement = dupNumList.stream()
                .distinct().toList();
        System.out.println(uniqueElement);


        List<String> dupStringList = Arrays.asList("Java", "Python", "C++", "Java", "PlSQL");
        List<String> uniqueStringList = dupStringList.stream().distinct().toList();
        System.out.println(uniqueStringList);
    }
}
