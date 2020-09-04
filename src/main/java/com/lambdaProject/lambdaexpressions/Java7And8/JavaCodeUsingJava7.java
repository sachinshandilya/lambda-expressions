package com.lambdaProject.lambdaexpressions.Java7And8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;

import com.lambdaProject.lambdaexpressions.LambdaExpressionsApplication;

public class JavaCodeUsingJava7 {
	
	
	public static void printAll(List<Person> personList) {
		for(Person p : personList) {
			System.out.println(p.getFname() + " " + p.getLname() );
		}
	}
	
	
	public static void printOnlyWithC(List<Person> personList) {
		for(Person p : personList) {
			if(p.getLname().startsWith("C")){
			System.out.println(p.getFname() + " " + p.getLname() );
		}
		}
	}
	
    
	public static void main(String[] args) {
		
		List<Person> person = Arrays.asList(
				  new Person("Ramesh", "Chacha", 24),
				  new Person("Somesh", "Choudhary", 24),
				  new Person("Suresh", "Dhaka", 24),
				  new Person("Mahesh", "Chinod", 24),
				  new Person("Akhilesh", "Mehta", 24)
				);  
		
		//Provide List in sorted order by name
		//Remember Comparator is a interface which has only one method compare which can be used to do custom sort
		Collections.sort(person , new Comparator<Person> () {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLname().compareTo(o2.getLname());
			}
		});
		
		
		//Print them one by one in above sorted order
		printAll(person);
		
		
		
		
		//Print only those having lastname starting with "C"
		
		printOnlyWithC(person);
		
		SpringApplication.run(JavaCodeUsingJava7.class, args);
        
		
	}
}
