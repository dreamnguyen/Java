package demo1;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
		int number, tg=1, giaithua=1;
		Scanner scanner= new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao mot so nguyen duong: ");
			number=scanner.nextInt();
		}while(number<=0);
		while(tg<=number) {
				giaithua *=tg;
				tg++;
			}
			System.out.println(number +"!= "  + giaithua);
	}	

}
