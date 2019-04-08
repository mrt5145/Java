package day30_Methods01;

import day31_Methods02.Calculator;

public class MethodsIntro {
	public static void main(String[] args) {
		sayHello();
		askHowRU();
		sayHello();
		reply();
		System.out.println("-So So!");
		sayBye();
		sayBye();
		
		sayHelloTo("Murat");
		
		String NameOf2ndPerson="Hasan";
		sayHelloTo(NameOf2ndPerson);
		
		Calculator.divide(3, 2);
	}
	
	public static void sayHello(){
	System.out.println("-Hello!");
	}
	
	public static void sayBye() {
		
		System.out.println("-Bye! Have a good day!");
	}
	public static void askHowRU() {
		
		System.out.println("-How are you doing?");
	}
	public static void reply() {
		
		System.out.println("-I am doing well, How about you?");
	}
	public static void sayHelloTo(String name)
	{
		System.out.println("Hello "+name);
	}
}
