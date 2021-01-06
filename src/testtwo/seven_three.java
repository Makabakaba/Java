package testtwo;
import java.util.Scanner;
import java.util.Arrays;
public class seven_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the integers between 1 and 100£º");
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		for(int i = 0; i < num.length ; i++) {
			num[i] = input.nextInt();
			if(num[i] == 0) break;
		}
		int[] base = new int[100];
		for(int i = 0; i < base.length ; i++) {
			base[i] = 0;
		}
		for(int i : num) {
			base[i]++;
		}
		for(int i = 0; i < base.length ; i++) {
			if(base[i] != 0) {
				if(base[i] > 1) System.out.println(i + " occurs " + base[i] + " times");
				else System.out.println(i + " occurs " + base[i] + " time");
			}
		}
	}

}
