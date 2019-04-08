package day38_WrapperClasses_StringBuilder;

import java.util.ArrayList;

public class ConvertStringToPrimitive {
	public static void main(String[] args) {
		
		String count = "423";
		int iCount = Integer.parseInt(count);
		System.out.println(iCount);
		
		String str = "Price is 45.77";
		String []sp = str.split(" ");
		double price= Double.parseDouble(sp[2]);
		System.out.println(price);
		String etsyResult = "“wooden spoon” (13,422 Results)";
		
		String[] result = etsyResult.split(" ");
		String count1= result[2].replace("(", "").replaceAll(",", "");
		int woodenSpoons = Integer.parseInt(count1);
		System.out.println(woodenSpoons);
		
		String[] sNums = {"324","32","67","567"};
		ArrayList<Integer> nums = new ArrayList<>();
		for(String num : sNums)
		{
			nums.add(Integer.valueOf(num));
		}
		System.out.println(nums);
	}
}
