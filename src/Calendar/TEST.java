
package Calendar;
import java.util.Calendar;


public class TEST {

	public static void main(String[] args) {

		Calendar now= Calendar.getInstance();
		
		int hour= now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("����ð��� " + hour + "��" + min + "�� �Դϴ�.");
		
	}

}
