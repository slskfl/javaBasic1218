import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("������: ");
		int num = scan.nextInt();
		System.out.println("������ �ڸ����� ������ ���� "+(num/10)+"�Դϴ�.");
		System.out.println("������ �ڸ����� "+(num%10)+"�Դϴ�.");
		
	}
}
