package day40_CustomClasses;

public class dogRunner {
	
	public static void main(String[] args) {
		dog dog1 = new dog();
		dog dog2 = new dog();
		dog dog3 = new dog();
		
		dog1.breed="GErman Shepherd";
		dog1.color="Brown";
		dog1.size = 50;
		dog1.bark();
		dog1.eat();
		dog1.run();
	}
	

}
