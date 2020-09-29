package testone;

import java.util.Scanner;

public class three_twentyThree {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë×ø±ê£º");
		Scanner input = new Scanner(System.in);
		double[] num = new double[2];
		for(int i=0; i < num.length; i++){
			num[i] = input.nextDouble();
		}
		if(Math.abs(num[0]) < 5 && Math.abs(num[1]) < 2.5) System.out.println("Point (" + num[0] + "," + num[1] + ") is in the rectangle");
		else System.out.println("Point (" + num[0] + "," + num[1] + ")  is not in the rectangle");
	}
}
