package day8_conditionals2;

public class Grades {
	public static void main(String[] args) {
		char grade='A';
		if(grade=='A')
		{
			System.out.println("Excellent");
			
		}
		else if(grade=='B')
		{
			System.out.println("Good");
		}
		else if(grade=='C')
		{
			System.out.println("Acceptable");
		}
		else if(grade=='D')
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Not a valid grade!");
		}
	}
}
