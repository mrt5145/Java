package day41_classes02_encapsulation;

public class Library {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("Ask");
		b1.setAuther("Elif Safak");
		b1.setPages(342);
		
		Book b2 = new Book();
		b2.setTitle("HeadFirst Java");
		b2.setAuther("Kathy Sirerra");
		b2.setPages(546);
		
		Read(b1);
		Read(b2);		
	}
	
	public static void Read(Book b1)
	{
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Title  : " +b1.getTitle());
		System.out.println("Auther : "+b1.getAuther());
		System.out.println("PAges  : "+b1.getPages());
		System.out.println("*-*-*-*-*-*-*-*-* -*-*-*-*-*-*-*-*");
	}
}
