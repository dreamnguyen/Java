package Chuong3;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		SPB3 sp1 = new SPB3("Coca",10000,1000);
		SPB3 sp2 = new SPB3("Pepsi", 8000);
		sp1.in();
		sp2.in();
	}

}

class SPB3 {
	public String tenSp;
	public double donGia;
	public double giamGia;
	
	public void nhap() {
		Scanner s= new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		tenSp=s.nextLine();
		
		System.out.println("Nhap don gia san pham: ");
		donGia=s.nextDouble();
		
		System.out.println("Nhap giam gia san pham: ");
		giamGia=s.nextDouble();
	}
	private double thue() {
		return (donGia/10);
	}
	public void in() {
		System.out.println("Ten san pham: " + tenSp);
		System.out.println("Don gia san pham: " + donGia);
		System.out.println("Giam gia san pham: " + giamGia);
		System.out.println("Thue san pham: " + thue());
		
	}
	public SPB3(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia= donGia;
		this.giamGia= giamGia;
	}
	public SPB3(String tenSp, double donGia) {
		this(tenSp,donGia,0);
	}
}