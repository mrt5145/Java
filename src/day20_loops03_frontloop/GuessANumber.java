package day20_loops03_frontloop;

import java.util.Random;

public class GuessANumber {
	public static void main(String[] args) {
		Random random=new Random();
		int number=random.nextInt(100);
		System.out.println(number);
		System.out.println(random.nextInt(50));
	}

}
