package testone;
import java.util.Scanner;
public class three_twentySeven {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë×ø±ê£º");
		Scanner input = new Scanner(System.in);
		double[] point = new double[2];
		for(int i = 0; i < point.length ; i++) {
			point[i] = input.nextDouble();
		}
		if(point[0] >= 0 && point[0] >= 0) {
			if(point[0]/2.0 + point[1] - 100 < 0 ) System.out.print("The point is in the triangle");
			else System.out.print("The point is not in the triangle");
		}
		else System.out.print("The point is not in the triangle");
	}

}