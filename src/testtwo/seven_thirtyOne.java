package testtwo;
import java.util.Scanner;
import java.util.Arrays;
public class seven_thirtyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter list1 size and contents: ");
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] num = new int[k];
		int[] save = new int[k];
		for(int i = 0; i < k ; i++) {
			num[i] = input.nextInt();
			save[i] = num[i];
		}
	}

}
