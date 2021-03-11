package Chuong3;
import java.util.Scanner;
public class bai1{
	public static void main(String[] args) {
		SanPham sp = new SanPham();
		sp.nhap();
		sp.in();
	}
}
	class SanPham {
	String tenSp;
	double donGia;
	double giamGia;
	double getThueNhapKhau() {
		double ThueNhapKhau;
		return ThueNhapKhau= donGia*0.1;
	}
	
	void in() {
		System.out.printf("Ten san pham: %s | Don gia: %f | Giam gia: %f | Thue nhap khau: %f ", tenSp, donGia, giamGia, getThueNhapKhau());
		
	}
	void nhap() {
		Scanner s= new Scanner(System.in);
		System.out.println("Nhap ten san pham: ");
		tenSp= s.nextLine();
		
		System.out.println("Nhap don gia san pham: ");
		donGia= s.nextDouble();
		
		System.out.println("Nhap giam gia san pham: ");
		giamGia= s.nextDouble();
		
	}

}
