
package com.training.mars;

import java.util.Scanner;


public class Employee {
    
    int number;
    String name;
    int age;
    String department; 
    char gender;
    double salary;
    
   
    public Employee(){
        number = 0;
        name = "";
        age = 0;
        department="";
        gender = ' ';
        salary = 0.0;
    }

    public Employee(int newNumber, String newName, int newAge,String newDepartment,char newGender, double newSalary){
        number = newNumber;
        name = newName;
        age = newAge;
        department= newDepartment;
        gender = newGender;
        salary = newSalary;
    }    

    public int getNumber(){
        return number;
    }

    public void setNumber(int newNumber){
        number = newNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    public String department(){
        return department;
    }
    
    public void setdepartment(String newDepartment) {
    	department = newDepartment;
    }
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char newGender){
        gender = newGender;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        salary = newSalary;
    }

    public void setRecord(Employee employee) {
        Scanner input = new Scanner(System.in);
       
 
        System.out.print("Enter your employee number: ");
        int number = input.nextInt();
        employee.setNumber(number);

        System.out.print("Enter your name: ");
        input.nextLine(); 
        String name = input.nextLine();
        employee.setName(name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        employee.setAge(age);

        System.out.print("Enter your gender: ");
        char gender = input.next().charAt(0);
        employee.setGender(gender);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        employee.setSalary(salary);
        }
    @Override
    public String toString(){
        return number + " " + name + " " + age + " " + gender + " " + salary;
    }
 
    }
    