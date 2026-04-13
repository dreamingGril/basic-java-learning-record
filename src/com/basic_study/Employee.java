package com.basic_study;

public class Employee {
    //定义一个变量name
    public String name;
    //定义一个变量age
    public int age;
    //定义一个变量salary
    public double salary;
    //定义get方法，返回name
    public String getName(){
        return name;
    }
    //定义set方法，设置name
    public void setName(String name){
        this.name = name;
    }
    //定义get方法，返回age
    public int getAge(){
        return age;
    }
    //定义set方法，设置age
    public void setAge(int age){
        this.age = age;
    }
    //定义get方法，返回salary
    public double getSalary(){
        return salary;
    }
    //定义set方法，设置salary
    public void setSalary(double salary){
        this.salary = salary;
        }
    //写一个hello方法
    public void hello(){
        System.out.println("Hello, I am an employee.");
    }
}
