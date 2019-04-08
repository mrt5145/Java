package day40_CustomClasses;

public class Company {
	public static void main(String[] args) {
		Employee mp1 =new Employee();
		mp1.firstName="Mike";
		mp1.lastName="Smith";
		mp1.Email=mp1.firstName+mp1.lastName+"@gmail.com";
		mp1.jobPos="Scrum Master";
		mp1.hourlySalary = 56.25;
		
		Employee mp2 = new Employee();
		mp2.firstName="Murat";
		mp2.lastName="Tuter";
		mp2.Email=mp1.firstName.toLowerCase()+mp1.lastName.toLowerCase()+"@gmail.com";
		mp2.jobPos="SDET";
		mp2.hourlySalary = 46.25;
		
		mp1.work();
		
		mp2.work();
		
		Employee mp3 = new Employee();
		
		System.out.println("Employee 1's Email  :  " + mp1.Email);
		System.out.println("Employee 2's Email  :  " + mp2.Email);
		
		System.out.println("Employee 3's Email  :  " + mp3.Email);
	}
}
