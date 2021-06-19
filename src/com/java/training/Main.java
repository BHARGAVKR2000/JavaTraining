package com.java.training;

public class Main {


    public static void main(String[] args) {
        Student myStudent = new Student("ram", "ram@gmail.com", 24);
//        System.out.println("Before Changing : "+myStudent.getName());
//        myStudent.setName("John Doe");
//        System.out.println("After Changing : "+myStudent.getName());

        Person person = new Person();
        Person person1 = new Person();
        person = person1;           // Comparing Object Reference
        person1.name = "john doe";

        if(person == person1){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
        System.out.println("Person 1 name: "+person1.name);
        System.out.println("Person name: "+person.name);

        person.age = 12;
        person1.age = 13;
        System.out.println("person 1 age: "+ person1.age);

        Person.execute();


    }
}