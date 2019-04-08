package day9_conditionals3;

public class RangeTest {
public static void main(String[] args) {
	int student=75;
	if(student>5 && student<30) {
		System.out.println("Lets do mentoring session");
	}
	else if(student>=30 && student<=60)
	{
		System.out.println("Lets have a lecture");
	}
	else if(student>60)
	{
		System.out.println("how many students need to take the class oline ?");
		student-=60;
		System.out.println(student+" students need to get online");
	}
	else
	{
		System.out.println("students must be more than 5");
	}
}
}
