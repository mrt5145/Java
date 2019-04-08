package day27_Arrays;

import java.util.Arrays;

public class containsALetter {
	 public static void main(String[] args) {
		   
		    String[] arr = {"zero", "one", "two","three","four"};
		    
		  		    
		    int j=0;
		    for(int i=0; i<arr.length;i++)
		    {
		    if(arr[i].contains("e"))
		    {
		      
		      j++;
		    }
		    }
		    System.out.println(j);
		    String[] fewValues=new String[j];
		    int k =0;
		    for(int i=0; i<arr.length;i++)
		    {
		    
		    if(arr[i].contains("e"))
		    {
		    	fewValues[k]=arr[i];
		    	k++;
		    }
		    }
		    for(String each:fewValues)
		    {
		      System.out.println(each); 
		    }
		    
		   
}
}