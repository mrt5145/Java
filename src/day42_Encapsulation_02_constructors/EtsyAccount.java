package day42_Encapsulation_02_constructors;

public class EtsyAccount {
	private String email;
	private String firstName;
	private String password;
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getPassword()
	{
		return password;
		
	}
	public void setPassword(String password)
	{
		if(password.length()>=6)
		{
		this.password = password;
		}
		else
		{
			System.out.println("Enter a valid password! It must be at least 6 characters.");
		}
	}
	
	public void setAccountInfo(String email,String firstName,String password)
	{
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
//		this.email=email;
//		this.firstName=firstName;
//		this.password=password;
	}
	public String getAccountInfo()
	{
//		System.out.println(email +"|"+ firstName+"|"+password);
		return email +" | "+ firstName+" | "+password;
	}
}
