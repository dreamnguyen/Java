package model;
import java.util.Scanner;
public class NhanVien {
	protected String tenNV;
	protected long luongNV;
	
	public NhanVien() {
		super();
	}
	public NhanVien(String tenNV) {
		super();
		this.tenNV=tenNV;
	}
	protected String loaiNV() {
		return "";
	}
	
	public void xuatThongTin() {
		System.out.println("===== Nhân Viên: "+ tenNV + "======");
		System.out.println("- Loại Nhân Viên: "+ loaiNV() + "");
		System.out.println("- Lương Nhân Viên: "+ luongNV + "VND");
	}
}
		


