package day40_CustomClasses;

public class MovieRunner {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.name = "Esaretin Bedeli";
		m1.length=160;
		m1.watch();
		m1.buy(12.99);
		
		Movie m2 = new Movie();
		m2.name = "Protector";
		m2.length=45;
		m2.watch();
		m2.buy(19.99);
		
		Movie m3 = new Movie();
		m3.name = "Ghajine";
		m3.length=180;
		m3.watch();
		m2.buy(7.99);
		
		
		
	}
}
