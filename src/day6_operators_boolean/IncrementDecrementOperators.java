package day6_operators_boolean;

public class IncrementDecrementOperators {
public static void main(String[] args) {
	int wincomputers=35;
	wincomputers++;
	System.out.println(wincomputers);
	wincomputers++;
	System.out.println(wincomputers);
	int unreadmessages= 50;
	System.out.println("Unread message: "+ unreadmessages);
	unreadmessages--;
	System.out.println("Unread message: "+ unreadmessages);
	System.out.println("Unread message: "+ unreadmessages--);
	System.out.println("Unread message: "+ unreadmessages);
}
}
