import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������: ");
		int num = scan.nextInt();
		System.out.println(num+"�� �Է��Ͽ����ϴ�.");
		
		System.out.println();
		System.out.print("������: ");
		int num2 = scan.nextInt();
		System.out.println("10�� ���� ����"+(num2+10)+"�Դϴ�");
		System.out.println("10�� �� ����"+(num2-10)+"�Դϴ�");
		
	}
}
