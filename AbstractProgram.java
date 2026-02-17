import java.util.Scanner;
abstract class Person {
    String name;
     void setName(String name){
        this.name = name;
     }
    abstract void setRequirements(Scanner sc);
    abstract void display();
}

class Student extends Person {
    int studclass, roll;
    char sec;
   
    void setRequirements(Scanner sc){
        System.out.print("enter Student Class: ");
        this.studclass = sc.nextInt();
        System.out.print("enter Section: ");
        this.sec = sc.next().charAt(0);
        System.out.print("enter Student\'s roll: ");
        this.roll = sc.nextInt();
       
    }
     void display(){
        System.out.println("name of student: " + name);
        System.out.println("Class of student: " + studclass);
        System.out.println("section of student: " + sec);
        System.out.println("Roll of student: "+ roll);
     }
}

class Employee extends Person {
    float empSalary;

    void setRequirements(Scanner sc){
       System.out.print("enter Employee\'s salary: ");
        this.empSalary = sc.nextFloat();
    }
    void display(){
        System.out.println("name of Employee: " + name);
        System.out.println("Salary of Employee: " + empSalary);
    
     }
}

public class AbstractProgram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student object
        Person s1 = new Student();
        s1.setName("Animesh");
        s1.setRequirements(sc);
        System.out.println("Displaying the data of the Student:");
        s1.display();

        System.out.println();

        // Employee object
        Person e1 = new Employee();
        e1.setName("Rahul");
        e1.setRequirements(sc);
        System.out.println("Displaying the Salary of Employee:");
        e1.display();

        sc.close();
    }
}






