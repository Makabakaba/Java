package testtwo;
import java.util.Scanner;
import java.util.Arrays;
public class seven_twentyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		int[] stu = new int[100];
		for(int i = 0; i < 100 ; i++){
			num[i] = -1;
			stu[i] = i;
		}
		for(int i = 0; i < 100 ; i++){
			for(int j = stu[i]; j < 100 ; j += (stu[i]+1)) {
				num[j] = num[j]*(-1);
			}
		}
		for(int i = 0; i < 100 ; i++){
			if(num[i] != -1) System.out.print(" " + (num[i]+1));
		}
	}

}
