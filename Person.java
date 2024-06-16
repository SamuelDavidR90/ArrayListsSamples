
package com.mycompany.reviewarrraylistsi;

import java.util.Scanner;


public class Person {
    private int num;
    private int idNumber;
    private String name;
    private String profession;
    private int age;
    
    Scanner keyboardInt = new Scanner(System.in);
    Scanner keyboardString = new Scanner(System.in);
    
    //constructors 
    
    public Person(){
        System.out.println("insert order number");
        num = keyboardInt.nextInt();
        System.out.println("insert id number");
        idNumber = keyboardInt.nextInt();
        System.out.println("Write your name");
        name = keyboardString.nextLine();
        System.out.println("Profession ??");
        profession = keyboardString.nextLine();
        System.out.println("write the age ");
        age = keyboardInt.nextInt();
    }

    public Person(int num, int idNumber, String name, String profession, int age) {
        this.num = num;
        this.idNumber = idNumber;
        this.name = name;
        this.profession = profession;
        this.age = age;
    }
    
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setNumber(int idNumber){
        this.idNumber = idNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public String getProfession(){
        return profession;
    }
    
    public void setProfession(String profession){
        this.profession = profession;
    }

    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
}
