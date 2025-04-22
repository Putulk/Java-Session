package com.company.javavers8;

public class CountOccurrenceOfChar{


    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
    }

    private static long count(String str,char ch){
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }
}
