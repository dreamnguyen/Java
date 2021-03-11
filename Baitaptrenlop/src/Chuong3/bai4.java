package Chuong3;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		SPB4 sp1= new SPB4("Coca",10000,1000);
		SPB4 sp2= new SPB4("Pepsi",8000,0);
		sp1.in();
		sp2.in();
	}
	
}
	class SPB4{
		private String tenSp;
		private double donGia, giamGia;
		public String getTenSp() {
			return this.tenSp;
		}
		public void setTenSp(String tenSp) {
			this.tenSp=tenSp;
		}
		public double getDonGia() {
			return this.donGia;
		}
		public void setDonGia() {
			this.donGia= donGia;
		}
		public double getGiamGia() {
			return this.giamGia;
		}
		public void setGiamGia() {
			this.giamGia= giamGia;
		}
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
			return(donGia/10);
		}
		void in() {
			System.out.println("Ten san pham: " + tenSp);
			System.out.println("Don gia san pham: " + donGia);
			System.out.println("Giam gia san pham: " + giamGia);
			System.out.println("Thue san pham: " + thue());
		}
		public SPB4(String tenSp, double donGia, double giamGia) {
			this.tenSp=tenSp;
			this.donGia=donGia;
			this.giamGia=giamGia;
		}
		public SPB4(String tenSp; double donGia) {
			this(tenSp,donGia,0);
		}
	}

