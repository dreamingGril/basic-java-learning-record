package com.basic_study;

public class TestEmployee {
    public static void main(String[] args) {
       Employee e = new Employee();
       e.setName("John");
       e.setAge(30);
       e.setSalary(50000);
       System.out.println("Name: " + e.getName());
       System.out.println("Age: " + e.getAge());
       System.out.println("Salary: " + e.getSalary());
       e.hello();
    }
}
