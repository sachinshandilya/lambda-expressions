package com.lambdaProject.lambdaexpressions.Java7And8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;

import com.lambdaProject.lambdaexpressions.LambdaExpressionsApplication;

public class Java8Code {


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
				  new Person("Amit", "Chacha", 24),
				  new Person("Sumit", "Choudhary", 24),
				  new Person("Deepak", "Dhaka", 24),
				  new Person("Akhilesh", "Chinod", 24),
				  new Person("Akhil", "Mehta", 24)
				);  
		
		//Provide List in sorted order by name
		//Remember Comparator is a interface which has only one method compare which can be used to do custom sort
		Collections.sort(person , (p1 , p2) ->  p1.getLname().compareTo(p2.getLname()));
		
		
		//Print them one by one in above sorted order
		printAll(person);
		
		
		
		
		//Print only those having lastname starting with "C"
		
		printOnlyWithC(person);
		
		SpringApplication.run(Java8Code.class, args);
        
		
	}
}
