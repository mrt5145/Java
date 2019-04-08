package day42_Encapsulation_02_constructors;

public class Car {
	private String type;
	private String make;
	private String model;
	private int speed;
	
	public Car() {
		System.out.println("Car class constructor");
		type = "Unknown";
		make = "Unknown";
		model = "Unknown";
	}
	
	public Car(String type, String make, String model)
	{
		System.out.println("3 args constructor");
		this.type=type;
		this.model=model;
		this.make=make;
	}
	public void accelerate(int mph)
	{
		speed+=mph;
		System.out.println(make + " "+type+" is accelarating.");
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public void setMake(String make)
	{
		this.make=make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	
}
