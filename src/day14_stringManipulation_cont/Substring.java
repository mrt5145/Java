package day14_stringManipulation_cont;

public class Substring {
	public static void main(String[] args) {
		String str="mrt5145@gmail.com";
		System.out.println(str.substring(0,7));
		System.out.println(str.substring(8));
		System.out.println("Murat".substring(0, 5));
		System.out.println("Murat".substring(0));
		int start=str.indexOf("@")+1;
		int end=str.indexOf("@");
		System.out.println(str.substring(0,end));
		System.out.println(start);
		System.out.println(str.substring(start));
		int end2=str.indexOf(".");
		System.out.println("so you have a "+str.substring(start, end2)+" account.");
	}
}
