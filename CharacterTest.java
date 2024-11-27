package com.company;

import java.util.Scanner;

public class CharacterTest{

    public static void main(String[] args) {
	// write your code here
        String str;
        int vowel=0,cons=0,spaces=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String...  ");
        str=scanner.nextLine();

        for(int i = 0; i<str.length() ; i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'
                    ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ){

                vowel++;

            }
            else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                cons++;
            }
            else {
                spaces++;
            }
        }

        System.out.println("Vowel counts: "+vowel);
        System.out.println("Consonant counts: "+cons);
        System.out.println("Total white space counts : "+spaces);
        System.out.println("My name is Putul");


    }
}
