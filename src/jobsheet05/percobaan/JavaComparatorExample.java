package jobsheet05.percobaan;

import java.util.Arrays;

public class JavaComparatorExample {
    public static void main(String[] args) {
        // Employee array which will hold employees
        Employee employee[] = new Employee[2];
        
        employee[0] = new Employee();
        employee[0].setAge(40);
        employee[0].setName("Joe");
        employee[1] = new Employee();
        employee[1].setAge(20);
        employee[1].setName("Mark");
        System.out.println("Order of employee before sorting is");
        //print array as is.
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
        
        Arrays.sort(employee, new AgeComparator());
        System.out.println("\n\nOrder of employee after sorting by employee age is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
        
        Arrays.sort(employee, new NameComparator());
        System.out.println("\n\nOrder of employee after sorting by employee age is");
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee " + (i + 1) + " name :: " + employee[i].getName() + ", Age :: " + employee[i].getAge());
        }
    }
}
