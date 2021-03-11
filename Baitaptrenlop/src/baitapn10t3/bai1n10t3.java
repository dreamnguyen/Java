package baitapn10t3;
import java.util.Scanner;
public class bai1n10t3 {
	public static void main(String[] args) {
		diem Diem = new diem();
		Diem.nhap();
		Diem.in();
		Diem.diemDoiXung();
		Diem.kcHaiDiem();
		Diem.ktra();
	}
}
	class diem {
		// khai báo biến hoành độ x tung độ y
		int x;
		int y;
		// khai báo tọa độ điểm đối xứng
		int x1;
		int y1;
		// khai báo biến tính độ dài 2 điểm 
		double delta, dttg;
		// nhập tọa độ x và y
		void nhap() {
			Scanner s = new Scanner(System.in);
			System.out.println("Nhap hoanh do x= ");
			x= s.nextInt();
			
			System.out.println("Nhap tung do y= ");
			y= s.nextInt();
		}
		// in tọa độ x và y
		void in() {
			System.out.println("Toa do diem A(" + x + ";" + y + ")");
		}
		// phương thức lấy tọa độ của điểm đxung qua trục ox
		void diemDoiXung() {
			x1 = x;
			y1 = -y;
			System.out.println("Toa do diem dxung la: (" + x1 + "," + y1 + ")");
		}
		// phương thức tính khoảng cách 2 điểm trên hệ tọa độ 
		void kcHaiDiem() {
			delta = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
			System.out.println("Khoang cach giua 2 diem la: " + delta);
		}
		void ktra() {
			if(x==0 || y==0) {
				System.out.println("Diem nay co nam tren truc toa do. ");
			}else {
				System.out.println("Diem nay ko nam tren truc toa do. ");
				dttg = delta * 0.5 * x;
				System.out.println("Dien tich tam giac la: " + dttg);
			}
		}
	}
