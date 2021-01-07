package testnine;
import java.util.Scanner;
import java.util.ArrayList;
public class twelve_eight{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String hex=input.nextLine();
		System.out.println("The decimal value for hex number "+hex
				+" is "+hextodec(hex.toUpperCase()));
	}
	
	public static int hextodec(String hex)throws HexFormatException{
		int decimalvalue=0;
		for(int i=0;i<hex.length();i++){
			char hexchar=hex.charAt(i);
			decimalvalue=decimalvalue*16+hexchartodec(hexchar);
		}
		return decimalvalue;
	}
	
	public static int hexchartodec(char ch)throws HexFormatException{
		if (ch >= '0' && ch <= '9') 
			return ch - '0';
		else if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else throw new HexFormatException(ch);
	}
}

class HexFormatException extends Exception{
	private char ch;
	HexFormatException(char ch){
		super("不是十六进制"+ch);
	}
	
	public char getch(){
		return ch;
	}
}
