package com.lambdaProject.lambdaexpressions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambdaExpressionsApplication {
	
	
	public void  GreetingMethod(Greeting happyGreeting) {
		happyGreeting.Greet();
	}

	public static void main(String[] args) {
		LambdaExpressionsApplication  a = new LambdaExpressionsApplication();
		
		//Method 1 :- using a class
		Greeting greet = new HappyGreeting();  //created a class to access Greet method of functional interface
		a.GreetingMethod(greet);
		
		
		//Method2 : using anonymous classes
		Greeting greet2 = new Greeting() {
			
			@Override
			public void Greet() {
				System.out.println("Greeting using annonymous class"); //but still we are creating a class to use a a ction
				
			}
		};
		a.GreetingMethod(greet2);
		
		//Method 3 :- Using Lambda expression
//		Greeting greet3 = () -> { System.out.println("Greeting from Lamda"); };
		
//		a.GreetingMethod(greet3);/]
		
		
		//Method 4 : Directly sending Lambda
		a.GreetingMethod(() ->  System.out.println("Greeting from Simplified Lambda") );
		
		SpringApplication.run(LambdaExpressionsApplication.class, args);
	}

}

















