package baitapn10t3;
import java.util.Scanner;
public class bai1n10t3 {
	public static void main(String[] args) {
		diem Diem = new diem();
		Diem.nhap();
		Diem.in();
	}
}
	class diem {
		int x;
		int y;
		
		void nhap() {
			Scanner s = new Scanner(System.in);
			System.out.println("Nhap hoanh do x= ");
			x= s.nextInt();
			
			System.out.println("Nhap tung do y= ");
			y= s.nextInt();
		}
		
		void in() {
			System.out.println("Toa do diem A(" + x + ";" + y + ")");
		}
	}
