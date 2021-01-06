package testtwo;
import java.util.Scanner;
import java.util.Arrays;
public class seven_eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ten nums");
		Scanner input = new Scanner(System.in);
		double[] num = new double[10];
		for(int i = 0; i < num.length ; i++) {
			num[i] = input.nextDouble();
		}
		int n=10;
		double temp;
	    for(int i = 0; i < n; i++){
	        for(int j = i; j < n; j++){
			    if(num[i] > num[j]){
				    temp = num[i];
				    num[i] = num[j];
				    num[j] = temp;
				}
			}
		}
	    for(int i = 0; i < num.length ; i++) {
	    	System.out.print(" " + num[i]);
		}
	}

}
