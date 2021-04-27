package abstractninterface;

public abstract class ContactList {
	abstract void insertPhone(int iIndex);
	
	abstract void removePhone(String keyword);
	
	abstract void updatePhone(String keyword);
	
	abstract void searchPhone(String keyword);
	
}
