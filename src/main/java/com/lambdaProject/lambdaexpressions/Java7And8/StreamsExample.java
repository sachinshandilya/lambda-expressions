package com.lambdaProject.lambdaexpressions.Java7And8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.*;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Streams Example");
		
		List<Person> person = Arrays.asList(
				  new Person("Ramesh", "Chacha", 24),
				  new Person("Somesh", "Choudhary", 24),
				  new Person("Suresh", "Dhaka", 24),
				  new Person("Mahesh", "Chinod", 24),
				  new Person("Akhilesh", "Mehta", 24)
				);  
		
		//Iterate over each object
		
		System.out.println("Method 2 : using for");
		//Method1
		for(int i = 0 ; i < person.size() ; i++ ) {
			System.out.println(person.get(i).getFname());
		}
		
		System.out.println("Method 2 : using for-in");
		//Method2
		for(Person P : person) {
			System.out.println(P.getFname());
		}
		
		System.out.println("Method 3 : using forEach Traditional");
		
		person.forEach(new Consumer<Person>() {

			@Override
			public void accept(Person p) {
				System.out.println(p.getFname());
				
			}
			
			
		});
		
		
	System.out.println("Method 4 : using forEach lambda");
		
		person.forEach(p -> System.out.println(p.getFname()));
		
		
		System.out.println("Using streams");
		person.stream()
		 .forEach(p -> System.out.println(p.getFname()));
		
		System.out.println("filtering");
		person.stream()
		.filter(p -> p.getLname().startsWith("C"))
		 .forEach(p -> System.out.println(p.getFname()));
		
		System.out.println("counting");
		System.out.println(person.stream()
		.filter(p -> p.getLname().startsWith("C"))
		.count());
		
	}

}
