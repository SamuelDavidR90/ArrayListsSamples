
package com.mycompany.reviewarrraylistsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewArrrayListsI {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        /*list.add(new Person());
        list.add(new Person());*/
        list.add(new Person());
        Scanner keyboardString = new Scanner(System.in);
         System.out.println("Would you like to regist one more person? Write Yes to continue and Not to Finish ");
         String answer = keyboardString.nextLine();
        //for test
        if(!answer.equalsIgnoreCase("no")){
            for(int i=0; i<list.size(); i++){
            list.add(new Person());
            System.out.println("Would you like to regist one more person? Write Yes to continue and Not to Finisho ");
            answer = keyboardString.nextLine();
            }
            
            
        }
        
        
        
        //index roaming
        System.out.println("-----FOR-------");
        for (int i=0; i<list.size(); i++){
            System.out.println("User registered: " + list.get(i).getName());
        }
        
        //FOREACH
        
        System.out.println("------FOREACH-----");
        for(Person sein:list){
            System.out.println("User Number: " + sein.getNum()+ " Id: " + sein.getIdNumber() + " Name: " + sein.getName());
            System.out.println("Profession: " + sein.getProfession() + " Age: " + sein.getAge());
            System.out.println("------------");
        }
    }
}
