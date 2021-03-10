package baitapn10t3;
import java.util.Scanner;
public class bai2n10t3 {
	public static void main(String[] args) {
		time thoigian = new time();
		
		thoigian.nhap();
		thoigian.in();
	}
}
	class time{
		private int hour;
		private int minute;
		private int s;
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
	}
