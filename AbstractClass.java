abstract class Person {
    String name;
     void setName(String name){
        this.name = name;
     }
    abstract void setRequirements();
    abstract void display();
}

class Student extends Person {
    int studclass, roll;
    char sec;
   
    void setRequirements(){
        this.studclass = 12;
        this.sec = 'A';
        this.roll = 15;
       
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

    void setRequirements(){
        this.empSalary = 60000;
    }
    void display(){
        System.out.println("name of Employee: " + name);
        System.out.println("Salary of Employee: " + empSalary);
    
     }
}

public class AbstractClass{
    public static void main(String[] args) {
        
        // Student object
        Person s1 = new Student();
        s1.setName("Animesh");
        s1.setRequirements();
        System.out.println("Displaying the data of the Student:");
        s1.display();

        System.out.println();

        // Employee object
        Person e1 = new Employee();
        e1.setName("Rahul");
        e1.setRequirements();
        System.out.println("Displaying the Salary of Employee:");
        e1.display();
    }
}





