package model;
import java.util.Scanner;
import util.Configs;
public class NhanVienPartTime extends NhanVien {
	private int gioLamViec;
	
	public NhanVienPartTime() {
		super();
	}
	
	public NhanVienPartTime(String tenNV, int gioLamViec) {
		super();
		this.tenNV=tenNV;
		this.gioLamViec=gioLamViec;
	}
	
	@Override 
	public String loaiNV() {
		return "Nhan vien part time";
	}
	
	public void tinhLuong() {
		luongNV= Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
	}

}
