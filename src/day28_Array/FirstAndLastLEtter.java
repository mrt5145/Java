package day28_Array;

import java.util.Scanner;

public class FirstAndLastLEtter {
	public static void main(String[] args) {
		 
		 String[] words = {"murat","caner","hasan","melike","mecit"};
//		 for(String each : words)
//		 {
//			System.out.print(each.charAt(0));
//			System.out.println(each.charAt(each.length()-1));
//		 }
//		 for(int i=0; i<words.length;i++)
//		 {
//			 System.out.println(words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));
//		 }
		 for(int i=0; i<words.length;i++)
			 {
				 System.out.println(words[i].substring(0,1)+""+words[i].substring(words[i].length()-1));
			 }
	}
}
