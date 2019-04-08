package day40_CustomClasses;

public class Employee {
	String firstName;
	String lastName;
	String Email;
	String jobPos;
	double hourlySalary;
	String id;
	
	public void work()
	{
		System.out.println(firstName+ " "+lastName + " is working as a "+ jobPos);
	}
//	public static void main(String[] args) {
//		Employee mp1 =new Employee();
//		mp1.firstName="Mike";
//		mp1.lastName="Smith";
//		mp1.Email=mp1.firstName+mp1.lastName+"@gmail.com";
//		mp1.jobPos="Scrum Master";
//		mp1.hourlySalary = 56.25;
//		
//
//	}
}
