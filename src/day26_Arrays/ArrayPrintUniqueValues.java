package day26_Arrays;

public class ArrayPrintUniqueValues {
	public static void main(String[] args) {
		int[]nums={1,2,3,4,2,3,4,44,12,20,100,33,100,27};
		
		for(int i=0;i<nums.length;i++)
		{
			int k = 0;
			for(int j=0;j<nums.length-1;j++)
			{
				if(i==j)
				{
					j++;
				}
				if(nums[i]==nums[j])
				{
					k++;
					break;
 				}
				
			}
			if(k==0) {
				System.out.println(nums[i]);
			}
		}
			
	}
}

