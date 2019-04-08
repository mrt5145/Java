package day39_StringBuilders;

public class ComparingStringBuilders {
	public static void main(String[] args) {
		StringBuilder builder1 = new StringBuilder("Java");
		StringBuilder builder2 = new StringBuilder("Java");
		System.out.println(builder1 == builder2); // False. Since both objects are different locations.
		
		System.out.println(builder1.equals(builder2));//false. 
		
//		How do we compare them ?? String Builder method also check the memory locations
		
//		So that after we convert them to string we can call String's equal method
		
		System.out.println(builder1.toString().equals(builder2.toString()));
		
		
		StringBuilder builder3 = builder1 ;
		System.out.println(builder3==builder1);
		System.out.println(builder1.equals(builder3));
		
		builder1.append(" programming");
		System.out.println(builder1.equals(builder3));
		System.out.println(builder1);
		
		System.out.println(builder3);
		
		StringBuilder builder4=builder1;
		
		builder4.replace(0, builder4.length(), "Murat");
		
		System.out.println(builder4==builder3);
		
		System.out.println(builder1);
	}
}
