package day8_conditionals2;

import java.util.Scanner;

public class ChooseALanguage {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("For English Press 1 ");
		System.out.println("For Spanish Press 2 ");
		System.out.println("For Turkish Press 3 ");
		System.out.println("For Russian Press 4 ");
		System.out.println("For Uygur Press 5 ");
		System.out.println("For Uzbek Press 6 ");
		System.out.println("For Kyrgyz Press 7 ");
		System.out.println("For Tajik Press 8 ");
		int selection=input.nextInt();
		if (selection==1)
		{
			System.out.println("Hi!");
		}
		else if(selection==2)
		{
			System.out.println("Hola!");
		}
		else if(selection==3)
		{
			System.out.println("Merhaba!");
		}
		else if(selection==4)
		{
			System.out.println("Гавайи!");
		}
		else if(selection==5)
		{
			System.out.println("Yahshimusiz!!");
		}
		else if(selection==6)
		{
			System.out.println("Xush kelibsiz");
		}
		else if(selection==7)
		{
			System.out.println("салам!");
		}
		else if(selection==8)
		{
			System.out.println("ханд!");
		}
	}
}

//package day8_conditionals2;
//
//import java.util.Scanner;
//
//public class ChooseALanguage {
//	public static void main(String[] args) {
//		/*
//		 * English -> 1
//		 * Spanish -> 2
//		 * Turkish -> 3
//		 * Russian -> 4
//		 * Uyghur -> 5
//		 * Uzbek -> 6
//		 * Kyrgyz -> 7
//		 * Tajik -> 8
//		 * Any other say -> I do not speak that language
//		 */
//		System.out.println("Please select: English -> 1 \n"+
//							"Spanish -> 2 \n"+
//							"Turkish -> 3 \n"+
//							"Russian -> 4 \n"+
//							"Uyghur -> 5 \n"+
//							"Uzbek -> 6 \n"+
//							"Kyrgyz -> 7 \n"+
//							"Tajik -> 8");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int language = scan.nextInt();
//		String greeting;
//		if(language == 1) {
//			greeting = "Hello, How are you?";
//		}else if(language == 2) {
//			greeting = "Hola , Como Estas?";
//		}else if(language == 3) {
//			greeting = "Merhaba, Nasilsiniz?";
//		}else if(language == 4) {
//			greeting = "Privet, Kak dela?";
//		}else if(language == 5) {
//			greeting = "ياخشىمۇسىز!";
//		}else if(language == 6) {
//			greeting = "Salom, Qalesiz?";
//		}else if(language == 7) {
//			greeting = "Salam, Kandaysiz?";
//		}else if(language == 8) {
//			greeting = "Salom, Chihel shumo?";
//		}else {
//			greeting = "I do not speak that language";
//		}
//		
//		System.out.println(greeting);
//		
//		
//		
//	}
//}