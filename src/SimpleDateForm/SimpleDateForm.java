package SimpleDateForm;


import java.util.Date;
import java.text.SimpleDateFormat;


public class SimpleDateForm 
{

	public static void main(String[] args) {

		Date today= new Date();
		
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(dateForm.format(today));
	}

}