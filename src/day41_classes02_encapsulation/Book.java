package day41_classes02_encapsulation;

public class Book {
	private String title ; 
	private String auther;
	private int pages;
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String newTitle)
	{
		title=newTitle;
	}
	
	public void setAuther(String newAuther)
	{
		auther = newAuther;
	}
	
	public String getAuther()
	{
		return auther;
	}
	
	public void setPages(int newPages)
	{
		pages = newPages;
	}
	public int getPages()
	{
		return pages;
	}
}
