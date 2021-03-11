package baitapn10t3;
import java.util.Scanner;
public class bai2n10t3 {
	public static void main(String[] args) {
		time thoigian = new time();
		
		thoigian.hamTao(0, 0, 0);
		thoigian.nhap();
		thoigian.in();
		thoigian.ChuyenDoi();
	}
}
	class time{
		private int hour;
		private int minute;
		private int s;
		
		private int chuyendoi;
		private int getHour() {
			return this.hour;
		}
		private void setHour() {
			this.hour=hour;
		}
		
		private int getMinute() {
			return this.minute;
		}
		private void setMinute() {
			this.minute=minute;
		}
		private int getS() {
			return this.hour;
		}
		private void setS() {
			this.s=s;
		}
		void hamTao(int hour, int minute, int s) {
			this.hour=hour;
			this.minute=minute;
			this.s=s;
		}
		void nhap() {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Nhap gio: ");
			hour= scanner.nextInt();
			
			System.out.println("Nhap phut: ");
			minute= scanner.nextInt();
			
			System.out.println("Nhap giay: ");
			s= scanner.nextInt();
		}
		void in() {
			System.out.println("Bay gio la: " + hour + "gio" + minute + "phut" + s +"giay");
		}
		void ChuyenDoi() {
			chuyendoi= hour * 3600 + minute * 60 + s;
			System.out.println("Chuyen doi sang gia tri thoi gian "+hour+"gio"+minute+"phut"+s+"giay ra giay la: "+chuyendoi+"giay");
		}
	}
