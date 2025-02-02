package com.assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Java");
        l_list.add("Python");
        l_list.add("Scala");
        l_list.add("Django");
        System.out.println("Created Linked List\n: " +l_list);

        //Add Items at specified position
        l_list.add(2, "JavaScript");
        l_list.add(3, "Kotlin");
        System.out.println("l_list after editing\n: " +l_list);

        //Add First and Last Item
        l_list.addFirst("First Course");
        l_list.addLast("Last Course");
        System.out.println("l_list after addition of item\n: " +l_list);

        // Remove from a position
        l_list.remove(1);
        l_list.remove(2);
        System.out.println("LinkedList after deletion of Item in 2nd and 3rd position\n: " +l_list);

        //Remove first and last Item
        l_list.removeFirst();
        l_list.removeLast();
        System.out.println("Final Content after removing first and last Item\n: "+l_list);

        //Iterating the linked list
        ListIterator<String> itrator = l_list.listIterator();
        System.out.println("List displayed using iterator:");
        while (itrator.hasNext()) {
            System.out.println(itrator.next());

        }
    }
}

