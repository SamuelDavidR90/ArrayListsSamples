
package com.mycompany.reviewarrraylistsi;

import java.util.ArrayList;
import java.util.List;


public class ReviewArrrayListsI {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        /*list.add(new Person());
        list.add(new Person());*/
        
        //for test
        for (int i=0; i<3; i++){
            list.add(new Person());
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
