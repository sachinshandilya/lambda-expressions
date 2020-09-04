package com.lambdaProject.lambdaexpressions.methodReference;

import org.springframework.boot.SpringApplication;

import com.lambdaProject.lambdaexpressions.LambdaExpressionsApplication;

public class MethodReferenceExample {
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Using anonymous class
//		Thread t = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("thread");
//			}
//		});
//		
//		t.start();  //run method of anonymous class gets called  //thread
		
		//Using simple lambda expression
//		  Thread t = new Thread (()-> System.out.println("thread started using lamda"));
//		  
//		  t.start();  //"thread started using lamda"
		
		//using Method Reference
		 Thread t = new Thread(MethodReferenceExample::printMessage);
		 
		 t.start();  //"thread started using Method Refernce"
		 
		 //Another way of writing method reference
//		 Thread t2 = new Thread(System.out::println);
//		 t2.start();   //"thread started using Method Refernce method 2"
		
		SpringApplication.run(LambdaExpressionsApplication.class, args);
	}
	
	private static void printMessage() {
		System.out.println("thread started using Method Refernce");
	}
	
}
