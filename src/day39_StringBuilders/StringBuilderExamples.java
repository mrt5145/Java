package day39_StringBuilders;

public class StringBuilderExamples {
	public static void main(String[] args) {
		StringBuilder stb1 = new StringBuilder("Halloween");
		System.out.println(stb1);
		
		StringBuilder stb2= new StringBuilder();
		stb2.append("Java");//Append for add more string
		System.out.println(stb2);
		stb2.append(",SQL").append(",HTML");
		System.out.println(stb2);
		
		StringBuilder listBuilder = new StringBuilder("Wooden Spoon");
		listBuilder.append(", Iron Spoon");
		listBuilder.append('s');
		listBuilder.append(100);
		
		
		StringBuilder letter = new StringBuilder("EWFSDSGFD");
		System.out.println(letter);
		
		letter.append("A");
		letter.append("N");
		letter.append("A");
		System.out.println(letter);
		
		letter.delete(letter.indexOf("S"), letter.indexOf("A"));
		System.out.println(letter);
		letter.delete(letter.indexOf("A"), letter.length());
		System.out.println(letter);
		
		StringBuilder stb7 = new StringBuilder("MURAT");
		stb7 =stb7.reverse();
		System.out.println(stb7);
		
		stb7.deleteCharAt(0);
		System.out.println(stb7);
		
		stb7.deleteCharAt(stb7.length()-1);
		System.out.println(stb7);
		
		StringBuilder stb8 = new StringBuilder("SeleniumAutomation");
		stb8.insert(stb8.indexOf("A"), " ");
		System.out.println(stb8);
		
		stb8.insert(stb8.indexOf(" ")," Test");
		System.out.println(stb8);
		
		StringBuilder stb9=new StringBuilder("Murat!Tuter");
		stb9.replace(stb9.indexOf("!"), stb9.indexOf("T"), " ");
		
		System.out.println(stb9);
		
		stb8.replace(stb8.indexOf(" "), stb8.indexOf("A"), " ");
		System.out.println(stb8);
		
	}
}
