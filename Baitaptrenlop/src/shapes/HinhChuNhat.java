package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
	public float dai;
	public float rong;
	//constructor
	public HinhChuNhat() {
		ten= "Hinh chu nhat ";
	}
	public void nhapChieuDai() {
		System.out.println("Nhap chieu dai: ");
		Scanner scanner= new Scanner(System.in);
		dai= scanner.nextFloat();
	}
	public void nhapChieuRong() {
		System.out.println("Nhap chieu rong: ");
		Scanner scanner= new Scanner(System.in);
		rong= scanner.nextFloat();
	}
	public void tinhChuVi() {
		chuVi= 2*(dai+rong);
	}
	public void tinhDienTich() {
		dienTich= dai*rong;
	}
}
