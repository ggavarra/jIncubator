package com.example.jIncubator.java8.comparators;

import com.example.jIncubator.model.Occupation;
import com.example.jIncubator.model.Person;

import java.util.Comparator;
import java.util.function.Function;

public class ChainingComparators {

    public static void main(String[] args) {
        //given 2 people - find the one who age is least and with more experience

        Person person1=new Person("GG",12, new Occupation(3));
        Person person2=new Person("PKP",11, new Occupation(10));
        
        Comparator<Person> personComparator= Comparator.comparing(Person::getAge);
        Comparator<Occupation> occupationComparator= Comparator.comparing(Occupation::getExperienceInYears);
        
      //  System.out.println("Result : "+personComparator.thenComparing(occupationComparator));
        
        
                
    }
 
    
}


