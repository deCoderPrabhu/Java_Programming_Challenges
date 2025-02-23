package programmingChallenge80_82;

public class Magazine extends LibraryItem{
	
	private static int isbn_number;
	private static int issue_number;
	
	static {
		isbn_number++;
		issue_number++;
	}
	Magazine(){
		this.isbn_number = 1;
		this.issue_number = 1;
	}
	
	public static void main() {
		
		Magazine Design = new Magazine();
		Design.Author = "Nishant";
		Design.itemID = "001";
		Design.titleId= "LIB3";
	}
}
