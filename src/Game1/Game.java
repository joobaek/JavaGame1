package Game1;

import java.text.SimpleDateFormat; // ��¥ ����
import java.util.Date;	// ������ ����
import java.util.Random; // ���� ���� ǥ�� 


public class Game {

	public static void main(String[] args) {

		Date today = new Date(); //���� ��¥�� �Է��ϴ� �׸�
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy�� MM�� dd��"); // ��¥ ������ ���ϴµ��� ����.
		Random r = new Random(); //���� �Լ�
		
		
		System.out.println(dateForm.format(today) + "�� ������<100> : " + Math.abs(r.nextInt() %101)+ '%'); // ��� ������

	}

}
