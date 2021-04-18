package demo1;
import java.util.Scanner;
public class bai3 {
	public static void main (String [] args) {
		int n, tuoi;
		String hoten;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten: ");
		hoten= scanner.next();
		System.out.println("nhap namsinh: ");
		n= scanner.nextInt();
		tuoi=2021-n;
		System.out.println("Tuoi" + tuoi);
		if(tuoi>0 && tuoi<18) {
			System.out.println("ban do tuoi Vi thanh nien ");
		}else if(tuoi>18 && tuoi<30) {
			System.out.println("ban la thanh nien");
		}else if(tuoi>30 && tuoi<60) {
			System.out.println("Ban la trung nien");
		}else {
			System.out.println("Ban gia");
		}
	}
}
