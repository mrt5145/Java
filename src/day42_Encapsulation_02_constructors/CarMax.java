package day42_Encapsulation_02_constructors;

public class CarMax {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setMake("Acura");
		car1.setModel("TSX");
		car1.setType("Sedan");
		car1.setSpeed(40);
		System.out.println("Make : " + car1.getMake());
		System.out.println("Current Speed : " + car1.getSpeed());
		
		car1.accelerate(30);
		
		System.out.println("Current Seed : " + car1.getSpeed());
		
		Car car2 = new Car();
		System.out.println("Car 2 make : " +car2.getMake());
		System.out.println("Car 2 model : " +car2.getModel());
		System.out.println("Car 2 type : " +car2.getType());
		
		Car car3 = new Car("Coupe","Ford","Mustang");
		System.out.println("Car 3 make : " +car3.getMake());
		System.out.println("Car 3 model : " +car3.getModel());
		System.out.println("Car 3 type : " +car3.getType());
	}
}
