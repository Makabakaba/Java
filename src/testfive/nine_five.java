package testfive;
import java.util.GregorianCalendar;
public class nine_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar object=new GregorianCalendar(2020,11,3);
		System.out.println(object.get(GregorianCalendar.YEAR) + "年" + object.get(GregorianCalendar.MONTH)+"月"
				+ object.get(GregorianCalendar.DATE)+"日");
		object.setTimeInMillis(1234567898765L);
		System.out.println(object.get(GregorianCalendar.YEAR) + "年" + object.get(GregorianCalendar.MONTH)+"月"
				+ object.get(GregorianCalendar.DATE)+"日");

	}

}
