package testseven;
import java.util.ArrayList;
import java.util.Scanner;
public class eleven_thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<Integer>list=new ArrayList<>();
		System.out.print("Enter:");
		for(int i=0;i<10;i++)
			list.add(input.nextInt());
		remove(list);
	}
	
	public static void remove(ArrayList<Integer>list){
		ArrayList<Integer>newlist=new ArrayList<>();
		
		for(int i=0;i<list.size();i++){
			if(!newlist.contains(list.get(i)))
			newlist.add(list.get(i));
		}
		System.out.print("The distinct integers are");
		
		for(int i=0;i<newlist.size();i++)
			System.out.print(" "+newlist.get(i));
	}
}
