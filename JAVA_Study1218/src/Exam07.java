import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수값: ");
		int num = scan.nextInt();
		System.out.println("마지막 자릿수를 제외한 값은 "+(num/10)+"입니다.");
		System.out.println("마지막 자릿수는 "+(num%10)+"입니다.");
		
	}
}
