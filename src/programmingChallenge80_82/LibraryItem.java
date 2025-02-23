package programmingChallenge80_82;

public class LibraryItem {
	
	public String itemID;
	public String titleId;
	public String Author;
	
	LibraryItem(){
		this.itemID = itemID;
		this.titleId  =titleId;
		this.Author  = Author;
	}
	LibraryItem(String itemID, String titleId,String Author){
		this.itemID = itemID;
		this.titleId  =titleId;
		this.Author  = Author;
	}
	
	public static void checkout() {
		System.out.println("Your Checkout process is done for this item");
	}
	
	public static void returnitem() {
		System.out.println("Your Item is returned.");
	}
	
	
	
	@Override
	public String toString() {
		return "LibraryItem [itemID=" + itemID + ", titleId=" + titleId + ", Author=" + Author + "]";
	}
	public static void main() {
		LibraryItem item = new LibraryItem("001","Design","Nishant");
		System.out.println(item);
		LibraryItem.checkout();
		LibraryItem.returnitem();
	}
	

}
