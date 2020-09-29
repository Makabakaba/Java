package testone;
import java.util.Scanner;

public class three_nine {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë9¸öÊı£º");
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int[] num = new int[9];
		for(int i=0; i < num.length; i++){
			num[i] = input.nextInt();
		}
		sum = (num[0]*1 + num[1]*2 + num[2]*3 + num[3]*4 + num[4]*5 + num[5]*6 + num[6]*7 + num[7]*8 + num[8]*9) % 11;
		for(int i=0; i < num.length; i++) {
				System.out.print(num[i]);
		}
		if(sum == 10) System.out.print("X");
		else System.out.print(sum);
	}

}
