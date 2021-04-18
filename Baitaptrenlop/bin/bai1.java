package demo1;

import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		float a, b, tong, hieu, tich, thuong;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhap so thu nhat : ");
		a= scanner.nextFloat();
		System.out.println("Nhap so thu hai : ");
		b= scanner.nextFloat();
		tong=a+b;
		System.out.println("Tong cua 2 so la: " + tong);
		hieu=a-b;
		System.out.println("Hieu cua 2 so la: "+ hieu);
		tich=a*b;
		System.out.println("Tich cua 2 so la: " + tich);
		thuong= a%b;
		System.out.println("Thuong lay du cua 2 so la: " + thuong);
		if(a>b) {
			System.out.println("So lon hon la: "+ a);
		}else {
			System.out.println("So be hon la: " + b);
		}
	}
	

}
