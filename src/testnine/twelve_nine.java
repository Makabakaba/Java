package testnine;
import java.util.Scanner;
import java.util.ArrayList;
public class twelve_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number:");
		String bin = input.nextLine();
		System.out.println("The decimal value for hex number "+bin+" is "+bin2dec(bin.toUpperCase()));
	}
	
	public static int bin2dec(String bin)throws HexFormatException2{
		int binimalvalue=0;
		
		for(int i = 0; i < bin.length(); i++){
			char binchar=bin.charAt(i);
			binimalvalue=binimalvalue*2+binchartodec(binchar);
		}
		
		return binimalvalue;
	}
	
	public static int binchartodec(char ch)throws HexFormatException2{
		if(ch >= '0' && ch <= '1')
			return ch-'0';
		else throw new HexFormatException2(ch);
	}
}

class HexFormatException2 extends Exception{
	private char ch;
	HexFormatException2(char ch){
		super("���Ƕ�����"+ch);
	}
	
	public char getch(){
		return ch;
	}

}
