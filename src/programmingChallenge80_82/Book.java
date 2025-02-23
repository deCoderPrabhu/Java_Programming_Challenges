package programmingChallenge80_82;

public class Book extends LibraryItem {
	
	private static int isbn_number;
	private static int issue_number;
	
	static {
		isbn_number++;
		issue_number++;
	}
	
	Book() {
		this.isbn_number = 1;
		this.issue_number = 1;
	}
	
	

	@Override
	public String toString() {
		return "Book [itemID=" + itemID + ", titleId=" + titleId + ", Author=" + Author + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public static void main() {
		
		Book Design = new Book();
		Design.Author = "Nishant";
		Design.itemID = "001";
		Design.titleId= "LIB2";
	}
}
