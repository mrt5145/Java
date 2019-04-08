package day28_Array;

public class SamenumberNexttoEachOther {
	public static void main(String[] args) {
		int[]numbers1= {1,5,5,3};
		int[]numbers2= {1,5,6,3};
		int[]numbers3= {1,2,5,3};
		int[]numbers4= {5,5,2,3};
		boolean found1=false;
		boolean found2=false;
		boolean found3=false;
		boolean found4=false;
		for(int i=0;i<numbers1.length-1;i++)
		{
			if(numbers1[i]==numbers1[i+1]&&numbers1[i]==5)
			{
				found1=true;
			}
			
		}
		for(int i=0;i<numbers2.length-1;i++)
		{
			if(numbers2[i]==numbers2[i+1]&&numbers2[i]==5)
			{
				found2=true;
			}
			
		}
		for(int i=0;i<numbers1.length-1;i++)
		{
			if(numbers3[i]==numbers3[i+1]&&numbers3[i]==5)
			{
				found3=true;
			}
			
		}
		for(int i=0;i<numbers1.length-1;i++)
		{
			if(numbers4[i]==numbers4[i+1]&&numbers4[i]==5)
			{
				found4=true;
			}
		}
		System.out.println("Found1= "+found1);
		System.out.println("Found2= "+found2);
		System.out.println("Found3= "+found3);
		System.out.println("Found4= "+found4);
	}
}
