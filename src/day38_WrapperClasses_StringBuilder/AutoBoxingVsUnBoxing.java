package day38_WrapperClasses_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVsUnBoxing {
	public static void main(String[] args) {
//		AUTO BOXING !!! Primitive to Wrapper ;
		double a = 34.5;
		Double a1 = a ; 
		int i = 100;
		Integer j = i ; 
		
		boolean b=true;
		Boolean b1 = b;
		
		List<Integer> nums=new ArrayList<>();
		nums.add(423);
		int p = 354;
		
		nums.add(p);
		
		nums.add(new Integer(123));
		
		System.out.println(nums);
		
//		UNBOXING = Wrapper to Primitive!
		int r = nums.get(0);
		
		Boolean bool = new Boolean(false);
		boolean bool1=bool;
		System.out.println(bool1);
		
		Character chObj='@';//AUTOBOXING from char to Character
		
		char chPrim = chObj;//UNBOXING happening from Character to char
		
		Character char3 = new Character('_');//No BOXING just create Character object.
		
		char ch7 = char3; // UNBOXING 
		System.out.println(chPrim);
		
		Integer intValue = new Integer(400);
		int Primitive = 400;
		if(intValue == Primitive)//UNBOXING int value is unboxed to primitive. Then compared.
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
