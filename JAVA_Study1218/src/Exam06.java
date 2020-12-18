import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수값: ");
		int num = scan.nextInt();
		System.out.println(num+"를 입력하였습니다.");
		
		System.out.println();
		System.out.print("정수값: ");
		int num2 = scan.nextInt();
		System.out.println("10을 더한 값은"+(num2+10)+"입니다");
		System.out.println("10을 뺀 값은"+(num2-10)+"입니다");
		
	}
}
