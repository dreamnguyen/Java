package demo1;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		int n;
		int tong=0;
		Scanner scanner = new Scanner (System.in);
		System.out.println("Nhap so nguyen: ");
		do {
			n= scanner.nextInt();
			tong=tong+n;
			if(tong>100) {
				break;
			}
		}while (n>0);
			System.out.println("Tong la= " + tong);
	}

}
