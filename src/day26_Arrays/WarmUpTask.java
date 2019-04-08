package day26_Arrays;

public class WarmUpTask {
public static void main(String[] args) {
	int[] numbers= {2,3,5,6,7,3,4,545,65,76,97};
	int lenght=numbers.length;
	for(int i=0;i<lenght;i++) {
		System.out.print(numbers[i]+" ");
	}
	for(int i=0;i<lenght;i++) {
		if(numbers[i]%2==1) {
			numbers[i]*=3;
		}
		else {
			numbers[i]*=2;
		}
	}
	System.out.println("\n");
	for(int i:numbers) {
		System.out.print(i+" ");
	}
}
}