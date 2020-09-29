package testone;
import java.util.Scanner;
public class three_twentyEight {

  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
  	System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
  	double x1 = input.nextDouble();
  	double y1 = input.nextDouble();
  	double w1 = input.nextDouble();
  	double h1 = input.nextDouble();
  	System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	double w2 = input.nextDouble();
	double h2 = input.nextDouble();
	int flag = 0;
	if(Math.abs(x2 - w2/2 -x1)<w1/2 && Math.abs(y2 - h2/2 - y1)<h1/2) flag+=1;
	else if(Math.abs(x2 - w2/2 -x1)<w1/2 && Math.abs(y2 + h2/2 - y1)<h1/2) flag+=1;
	else if(Math.abs(x2 + w2/2 -x1)<w1/2 && Math.abs(y2 - h2/2 - y1)<h1/2) flag+=1;
	else if(Math.abs(x2 + w2/2 -x1)<w1/2 && Math.abs(y2 + h2/2 - y1)<h1/2) flag+=1;
	if(flag == 4) System.out.print("r2 is inside r1");
	else if(flag >= 1) System.out.print("r2 overlaps r1");
	else System.out.print("r2 does not overlap r1");
  }
}
