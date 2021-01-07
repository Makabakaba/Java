package testnine;
import java.util.Scanner;
import java.util.ArrayList;
public class twelve_seven{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter:");
		String bin=input.nextLine();
		System.out.println("The decimal value for hex number "+bin+" is "+bin2dec(bin.toUpperCase()));
	}
	
	public static int bin2dec(String bin){
		int binimalvalue=0;
		
		for(int i=0;i<bin.length();i++){
			char binchar=bin.charAt(i);
			binimalvalue=binimalvalue*2+binchartodec(binchar);
		}
		return binimalvalue;
	}
	
	public static int binchartodec(char ch)throws java.lang.NumberFormatException {
		if(ch>='0'&&ch<='1')
			return ch-'0';
		else throw new java.lang.NumberFormatException("不是十进制");
	}
}
