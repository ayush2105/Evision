package testingprograms;

import collection.ArrayList123;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public static void main(String[] args) {
        Evision.Employee employee=new Evision.Employee("Ayush");
        System.out.println("Name is : "+employee.getName());
        Evision evision=new Evision();
        evision.setSalary(250000);
        System.out.println("Salary is : "+evision.getSalary());


    }
}