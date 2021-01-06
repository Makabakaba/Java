package testtwo;
import java.util.Scanner;
import java.util.Arrays;
public class seven_ninteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the list: ");
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		System.out.print("Enter the contents of the list: ");
		int[] num = new int[k];
		int[] save = new int[k];
		for(int i = 0; i < k ; i++) {
			num[i] = input.nextInt();
			save[i] = num[i];
		}
		System.out.print("The list has " + k +" integers");
		for(int i = 0; i < k ; i++) {
			if(i == k-1) {
				System.out.println(" " + num[i]);
				break;
			}
			System.out.print(" " + num[i]);
		}
		int temp;
	    for(int i = 0; i < k; i++){
	        for(int j = i; j < k; j++){
			    if(num[i] > num[j]){
				    temp = num[i];
				    num[i] = num[j];
				    num[j] = temp;
				}
			}
		}
	    for(int i = 0; i < k; i++) {
	    	if(num[i] != save[i]) {
	    		System.out.println("The list is not sorted");
	    		break;
	    	}
	        System.out.println("The list is already sorted");
	    }
	}

}
