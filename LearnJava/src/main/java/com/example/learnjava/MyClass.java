package com.example.learnjava;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class MyClass
{
    public static void main(String[] args)
    {
        String myString = "Hello";
        boolean hasCharH = myString.contains("H");
        boolean stringEmpty = myString.isEmpty();

        if(!stringEmpty && hasCharH)
        {
            System.out.println(myString);
        }
        else
        {
            System.out.println("Empty");
        }


        Employee deyvison = new Employee();
        deyvison.setFirstName("Deyvison");
        deyvison.setLastName("Santos");
        deyvison.setAge(22);
        deyvison.setIdNumber(1);
        deyvison.setAnnualSalary(10000);

        Employee sara = new Employee();
        sara.setFirstName("Sara");
        sara.setLastName("Freitas");
        sara.setAge(21);
        sara.setIdNumber(2);
        sara.setAnnualSalary(10000);

        Manager arya = new Manager();
        arya.setFirstName("Arya");
        arya.setLastName("Santos");
        arya.setAge(5);
        arya.setIdNumber(3);
        arya.setAnnualSalary(50000);

//        HashSet<Person> people = new HashSet<Person>();
//
//        people.add(sara);
//        people.add(deyvison);

        Employee[] people = new Employee[]{sara, deyvison, arya};

        for(Employee emp : people)
        {
            System.out.println(emp);
        }

//        Person legolas = new Person("Legolas", "Greenleaf", 2931);
//        System.out.println(legolas.getAge());
    }
}