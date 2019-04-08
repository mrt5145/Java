package day42_Encapsulation_02_constructors;

public class EtsyRegistrationPage {
	public static void main(String[] args) {
		EtsyAccount acc1=new EtsyAccount();
		acc1.setEmail("mrt5145@gmail.com");
		acc1.setFirstName("Murat");
		acc1.setPassword("h1435");
		
		System.out.println(acc1.getEmail());
		
		
		EtsyAccount acc2=new EtsyAccount();
		acc1.setEmail("account@gmail.com");
		acc1.setFirstName("Sarah");
		acc1.setPassword("Sar1234");
		
		EtsyAccount acc3=new EtsyAccount();
		acc1.setEmail("account2@gmail.com");
		acc1.setFirstName("Saylan");
		acc1.setPassword("Say9876");
		
		System.out.println("First name of Account1 : " + acc1.getFirstName());
		
		EtsyAccount acc4=new EtsyAccount();
		acc4.setAccountInfo("hasd@gmail.com", "Hasan", "has456");
		
		System.out.println(acc4.getEmail());
		
		acc4.setEmail(acc4.getEmail().replace("gmail", "yahoo"));
		System.out.println(acc4.getEmail());
		System.out.println(acc4.getAccountInfo());
		
		EtsyAccount acc5=new EtsyAccount();
		
		acc5.setAccountInfo("acc5@gmail.com", "Kuso", "123sdf");
		System.out.println(acc5.getAccountInfo());
	}
	
}
