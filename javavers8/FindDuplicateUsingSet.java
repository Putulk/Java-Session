package com.company.javavers8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateUsingSet{
    public static Set<Integer> findDuplicateInStream(Stream<Integer> stream){
        Set<Integer> result = new HashSet<>();
        return stream.filter(x -> !result.add(x))
                .collect(Collectors.toSet());
//        return stream
//                .distinct()
//                .collect(Collectors.toList());
    }
    public static void main(String args[])
    {

        // Initial stream
        Stream<Integer> stream
                = Stream.of(2, 17, 5,
                20, 17, 30,
                4, 23, 59, 23);

        // Print the found duplicate elements
        System.out.println(
                findDuplicateInStream(stream));
    }
}
