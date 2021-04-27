package abstractninterface;
import java.util.Scanner;
public class Contact extends ContactList{
	String Ten;
	String SoDienThoai;
	Contact obj[] = new Contact[4];
	Scanner sc= new Scanner(System.in);
	
	public void NhapThongTin() {
		System.out.println("Nhap ten: ");
		Ten= sc.nextLine();
		System.out.println("Nhap sdt: ");
		SoDienThoai= sc.nextLine();
	}
	
	@Override
	public void insertPhone(int iIndex) {
		Contact ct= new Contact();
		ct.NhapThongTin();
		obj[iIndex] = ct;
		
	}
	@Override
	public void updatePhone(String keyword) {
		boolean kt=true;
		for(int i=0;i<obj.length;i++) {
			if(obj[i].Ten==keyword) {
				System.out.println("Nhập số điện thoại mới: ");
			}
		}
		if(kt==false) {
			System.out.println("Không tìm thấy thông tin !!");
		}
	}
	@Override
	public void removePhone(String keyword) {
		
	}
	@Override
	public void searchPhone(String keyword) {
		boolean chk=true;
		for (int i=0;i<obj.length;i++) {
			if(obj[i].Ten==keyword) {
				System.out.println("Tên: "+ obj[i]);
				System.out.println("Số điện thoại: "+ obj[i]);
			}
			if(chk==false) {
				System.out.println("Không tìm thấy danh bạ. ");
			}
		}
	}

}
