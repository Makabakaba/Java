package testtwo;
import java.util.Scanner;
//import java.util.Arrays;
public class seven_thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		System.out.print(getRandom(x));

	}
	public static int getRandom(int numbers) {
		return (int)(Math.random()*54+1);
    }
}
