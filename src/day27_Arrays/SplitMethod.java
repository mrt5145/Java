package day27_Arrays;

public class SplitMethod {
	public static void main(String[] args) {
		String words="java-selenium-cucumber-testing-junit-eclipse-maven-git-github";
		String [] SplitedArray=words.split("-");
		System.out.println(SplitedArray.length);
		System.out.println(SplitedArray[0]);
		for(String each:SplitedArray)
		{
			System.out.println(each);
		}
		
		String SearchResults="All categories “spoon” 138,555 Results";
		String[] SplittedSearchResult=SearchResults.split(" ");
		System.out.println(SplittedSearchResult.length);
		for(String each1:SplittedSearchResult)
		{
			System.out.println(each1);
		}
		System.out.println(SplittedSearchResult[SplittedSearchResult.length-2]);
	}
}
