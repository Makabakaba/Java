package testone;
import java.util.Scanner;
public class three_nineteen {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë3¸öÊı£º");
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0; i < num.length; i++){
			num[i] = input.nextInt();
		}
        if(((num[0]+num[1])>num[2]) && ((num[0]+num[2])>num[1]) && ((num[1]+num[2])>num[0])) System.out.println(num[1]+num[2]+num[0]);
        else System.out.println("input error");
	}

}
