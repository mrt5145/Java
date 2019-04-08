package Day35_ReviewOfMethods;

public class splitMethod {
	
	public static void main(String[] args) {
		
		String number="827.000.000";
		
		System.out.println(result(number));
	}
	public static String result(String number)
	{
		number= number.replace(".", "");
//		String[] nums= number.split(".");
//		String result="";
//		for(int i = 0; i<nums.length;i++)
//		{
//			result+=nums[i];
//		}
//		System.out.println("Result= "+result);
		return number;
	}
}
