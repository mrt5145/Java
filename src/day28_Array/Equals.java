package day28_Array;

import java.util.Arrays;

public class Equals {
public static void main(String[] args) {
	int[]a= {1,2,3};
	int[]b= {1,2,3};
	int[]c= {1,2,3,4};
	int[]c2= {4,3,1,2};
	boolean d=Arrays.equals(a, b);
	boolean e=Arrays.equals(a, c);
	boolean f=Arrays.equals(b, c);
	boolean g=Arrays.equals(c, c2);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	Arrays.sort(c2);
	g=Arrays.equals(c, c2);
	System.out.println(g);
	b=c;
	boolean k=Arrays.equals(a, b);
	boolean l=Arrays.equals(a, c);
	boolean m=Arrays.equals(b, c);
	System.out.println(k);
	System.out.println(l);
	System.out.println(m);
	System.out.println(Arrays.toString(b));
	c[2]=27;
	System.out.println(Arrays.toString(b));
}
}
