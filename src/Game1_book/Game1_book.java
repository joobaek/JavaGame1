package Game1_book;

import java.text.SimpleDateFormat; // ��¥ ����
import java.util.Date;	// ������ ����
import java.util.Random; // ���� ���� ǥ�� 


public class Game1_book {

	public static void main(String[] args) {

		Date today = new Date(); //Date Ŭ������ ��ü ����
		SimpleDateFormat dateForm= new SimpleDateFormat("yyyy�� MM�� dd����"); // ��¥ ������ ���ϴµ��� ����.
		System.out.print(dateForm.format(today)); // ���� ��¥ ���.
		Random r = new Random(); //���� �Լ�
		int Ram = Math.abs(r.nextInt() %100)+1; // 100���� ���� �������� ����� 1�� ���� ��
		
		System.out.println("������<100> : " + Ram + '%'); // ��� ������

	}


}
