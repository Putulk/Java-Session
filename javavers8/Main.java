package com.company.javavers8;

import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
        List<Employee> employee = Arrays.asList(
                new Employee("rajesh",23,23000),
                new Employee("mohan",21,29000),
                new Employee("amrita",25,13000) );

        // calculate average sal of employee older than 20
        double avgSal = employee.stream()
                .filter(e-> e.getAge()>20) // filter age > 20 employees
                .mapToDouble(s->s.getSalary()).average().orElse(0.0); //calculate avg salary

        System.out.println(avgSal);

        // Sort the employee by age
        List<Employee> sortedEmp = employee.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .collect(Collectors.toList());

        sortedEmp.forEach(System.out::println);

        // Employee having highest salary

        Employee higheshSalEmployee = employee.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println(higheshSalEmployee.getName()+" "+higheshSalEmployee.getAge()+ " "+higheshSalEmployee.getSalary());


        List<Product> product = new ArrayList<>();
        product.add(new Product("radio", 99.0, 0));
        product.add(new Product("television", 82.0, 3));
        product.add(new Product("earbud", 82.5, 5));
        product.add(new Product("charger", 88.5, 0));
        product.add(new Product("mobile", 99.5, 2));
        product.add(new Product("mobile", 99.5, 2));

        //calculate the total cost of all products which are in stock.

        double totalCost = product.stream()
                .filter(product1 -> product1.getQuantity()>0)
                .mapToDouble(Product::getPrice).sum();

        System.out.println("\nTotal cost of available products "+totalCost);

        //Name of all products in stock
        List<String> names = product.stream()
                .filter(product1 -> product1.getQuantity()>0)
                .map(Product::getName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Name of available products: "+names);

        Map<String, Integer> productNameAndQuantity = product.stream()
                .filter(product1 -> product1.getQuantity() > 0)
                .collect(Collectors.toMap(Product::getName, Product::getQuantity, Integer::sum));

        System.out.println("productNameAndQuantity "+productNameAndQuantity);
    }
}
