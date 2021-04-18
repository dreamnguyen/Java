package demo1;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhap so: ");
		a=scanner.nextInt();
		if(a%2==0) {
			System.out.println("so nay la so chan"+a);
		}else {
			System.out.println("so nay la so le"+a);
		}
	}
}
