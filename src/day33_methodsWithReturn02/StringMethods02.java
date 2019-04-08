package day33_methodsWithReturn02;

public class StringMethods02 {

	public static void main(String[] args) {
		System.out.println(countTimes("Murat","a"));
		System.out.println(countTimes1("Murat",'a'));
		System.out.println(countTimes2("Murat","a"));
		System.out.println(countTimes3("Murat","a"));
	}
	
	
	//TODO : çalış buraya
	
	
	public static int countTimes1(String one,char two)
	{
		int count=0;
		for(int i=0; i<one.length();i++)
		{
			if(one.charAt(i)==two)
			{
				count++;
			}
			
		}
		return count;
	}
	
	public static int countTimes(String one,String two)
	{
		int count=0;
		for(int i=0; i<one.length();i++)
		{
			if(one.substring(i, i+1).equals(two))
			{
				count++;
			}
			
		}
		return count;
	}
	public static int countTimes2(String one,String two)
	{
		String [] arr= one.split(two);
		return (arr.length-1);
	}
	public static int countTimes3(String one,String two)
	{
		int len1=one.length();
		one=one.replaceAll(two, "");
		int len2=one.length();
		return len1-len2;
	}
}
