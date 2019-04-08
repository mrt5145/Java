package day39_StringBuilders;

public class AppendAlphabet {
	public static void main(String[] args) {
		
		char ch = 'A';
		ch++;
		System.out.println(ch);
		StringBuilder alphabet =new StringBuilder();
		
		for(char chars='A'; chars<='Z';chars++)
		{
			alphabet.append(chars);
			System.out.println(alphabet);
		}
		
		for(int a=alphabet.length(); a==0; 
				 a--)
		{
			alphabet.delete(a-1, a);
			System.out.println(alphabet);
		}
	}
}
