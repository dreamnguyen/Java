package model;
import java.util.Scanner;

import util.Configs;
public class NhanVienFullTime extends NhanVien {
	private int ngayLamThem;
	private int loaiChucVu;
	
	public NhanVienFullTime() {
		super();
	}
	
	public NhanVienFullTime(String tenNV, int ngayLamThem) {
		super();
		this.tenNV=tenNV;
		this.ngayLamThem=ngayLamThem;
	}
	
	public int getLoaiChucVu() {
		return loaiChucVu;
	}
	public void setLoaiChucVu(int loaiChucVu) {
		this.loaiChucVu=loaiChucVu;
	}
	
	@Override 
	public String loaiNV() {
		return "Nhan vien full time";
	}
	
	public void tinhLuong() {
		luongNV= Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + (ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY) ;
		luongNV= Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + (ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY) ;
	}
}
