package Chuong3;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		SP sp1 = new SP();
		SP sp2 = new SP();
		sp1.nhap();
		sp2.nhap();
		sp1.in();
		sp2.in();
	}

}
class SP {
	String tenSp;
	double donGia;
	double giamGia;
	void nhap() {
		Scanner s= new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		tenSp=s.nextLine();
		
		System.out.println("Nhap don gia san pham: ");
		donGia=s.nextDouble();
		
		System.out.println("Nhap giam gia san pham: ");
		giamGia=s.nextDouble();
	}
	double thue() {
		return (donGia/10);
	}
	void in() {
		System.out.println("Ten san pham: " + tenSp);
		System.out.println("Don gia san pham: " + donGia);
		System.out.println("Giam gia san pham: " + giamGia);
		System.out.println("Thue san pham: " + thue());
		
	}
}
