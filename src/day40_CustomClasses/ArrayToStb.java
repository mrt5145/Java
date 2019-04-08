package day40_CustomClasses;

import java.util.Arrays;

public class ArrayToStb {
	public static void main(String[] args) {
		String[] words = new String[5];
		words[0]="coffee";
		words[1]="tea";
		words[2]="water";
		words[3]="juice";
		words[4]="milk";
		System.out.println(Arrays.toString(words));
		
		
		StringBuilder wordsStb=new StringBuilder();
		wordsStb.append(words[0]).append(words[1]).append(words[2]).append(words[3]).append(words[4]);
		
		System.out.println(wordsStb);
		
		StringBuilder wordsStb2 = new StringBuilder();
		for(int i=0; i<words.length;i++)
		{
			wordsStb2.append(words[i]+" ");
		}
		System.out.println(wordsStb2);
	}
}
