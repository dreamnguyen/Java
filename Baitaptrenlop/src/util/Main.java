package util;
import java.util.Scanner;
import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;
public class Main {
	public static void main (String[] args) {
		// Công ty có 4 nhân viên toàn thời gian, trong đó có 1 sếp, sếp làm thêm 20 ngày 
		NhanVienFullTime sep= new NhanVienFullTime("Nguyễn Sỹ Ước", 20);
		sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
		
		NhanVienFullTime linh1= new NhanVienFullTime("Lê Hoài Nam", 1);
		
		NhanVienFullTime linh2= new NhanVienFullTime("Trịnh Phương Hoàn", 0);
		
		NhanVienFullTime linh3= new NhanVienFullTime("Lê Đức Phan Long", 5);
		
		// Công ty đang thuê 1 NV thời vụ
		NhanVienPartTime dat= new NhanVienPartTime("Nguyễn Văn Đạt",30);
		
		// Tính lương cho NV
		
		sep.tinhLuong();
		linh1.tinhLuong();
		linh2.tinhLuong();
		linh3.tinhLuong();
		dat.tinhLuong();
		
		// in thong tin nhân viên
		sep.xuatThongTin();
		linh1.xuatThongTin();
		linh2.xuatThongTin();
		linh3.xuatThongTin();
		dat.xuatThongTin();
		
			
		
	}

}