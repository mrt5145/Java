package day26_Arrays;

public class toCharArray {
public static void main(String[] args) {
	String word="Hello";
	char[] letters = word.toCharArray();
	for(char letter : letters) {
	System.out.println(letter);
	}
	System.out.println();
	
	String gift="Diomand Ring";
	char [] giftletters=gift.toCharArray();
	
	for(int i =giftletters.length-1; i>=0;i--)
	{
		System.out.print(giftletters[i]);
	}

	}
}

