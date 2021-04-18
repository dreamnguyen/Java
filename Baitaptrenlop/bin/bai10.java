package demo2;
import java.util.Scanner;
public class bai10 {
	public static void main(String[] args) {
		char Kytu;
		int count=0;
		String chuoi;
		
		Scanner scanner = new Scanner (System.in);
		do {
			System.out.println("Nhap vao mot chuoi: ");
			chuoi= scanner.nextLine();
		}while(chuoi.length()>80);
		
		System.out.println("Nhap vao ky tu can dem so lan xuat hien: ");
		Kytu= scanner.next().charAt(0);
		
		for(int i=0; i<chuoi.length();i++) {
			if(Kytu==chuoi.charAt(i)) {
				count++;
			}
		}
		System.out.println("So lan xuat hien cua ky tu " + Kytu + " trong chuoi " + chuoi + " la " + count );
	}

}
