package shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc{
	public float banKinh;
	
	//constructor
	public HinhTron() {
		ten="Hinh tron";
	}
	public void nhapBanKinh() {
		System.out.println("Ban Kinh = ");
		Scanner scanner= new Scanner(System.in);
		banKinh= scanner.nextFloat();
	}
	
	public void tinhChuVi() {
		chuVi=2*PI*banKinh;
	}
	public void tinhDienTich() {
		dienTich= PI*banKinh*banKinh;
	}

}
