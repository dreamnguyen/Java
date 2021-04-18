package demo1;
import java.util.Scanner;
public class bai9 {
	public static void main(String[] args) {
		String line;
		int ktso=0, ktt=0, kthoa=0;
		Scanner scanner= new Scanner(System.in);
		do {
			System.out.println("Nhap vao 1 chuoi bat ky: ");
			line=scanner.nextLine();
		}while(line.length()>100);
		for(int i =0; i<line.length();i++) {
			// kiem tra xem co phai ky tu in hoa hay ko?
			if(Character.isUpperCase(line.charAt(i))) {
				kthoa++;
			}
			// kiem tra xem co phai ky tu in thuong hay ko?
			if(Character.isLowerCase(line.charAt(i))) {
				ktt++;
			}
			// kiem tra xem co phai ky tu so hay ko?
			if(Character.isDigit(line.charAt(i))) {
				ktso++;
			}
		}
		System.out.println("Chuoi " + line + " co " + ktso + " ky tu so," + " co " + kthoa + " ky tu in hoa," + " co " + ktt + " ky tu in thuong");
		
	}
}
