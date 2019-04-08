package day7_conditions;

public class SpeedLimitConditional {

	public static void main(String[] args) {
		int speedlimit=55;
				int currentspeed=70;
				if(currentspeed>(speedlimit+20)){
					System.out.println("you should get ticket");
					
				}
				else {
					System.out.println("You are good!");
				}
	}
}
