package programmingChallenge51_52;

public class Book {
	static int totalBooks;
	String title;
	String author;
	long isbn;
	boolean isborrowed;
	
	
	static {
		totalBooks = 0;
	}
	{
		totalBooks++;
	}
	
	Book(String title, String author, long isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	
	Book(long isbn){
		this("Unknown ", " Unknown", isbn);
	}
	static int totalnoOfBooks() {
		return totalBooks;
	}
	
	void borrowBook() {
		if(isborrowed) {
			System.out.println("This book is already borrowed");
		}else {
			this.isborrowed = true;
			System.out.println("Enjoy reading this book");
		}
	}
	void returnBook() {
		if(isborrowed) {
			isborrowed = false;
			System.out.println("Hello! This book is Available");	
		}else {
			System.out.println("Nope! This Book is in Store");	
		}
	}
	
	public static void main(String[] args) {
		
		Book Patient = new Book("Be Patient", " James Gosling", 12345678);
		Book Peace = new Book(123456256);
		System.out.println(totalnoOfBooks());
		Patient.borrowBook();
		Peace.borrowBook();
		Patient.returnBook();
		Peace.returnBook();
		Peace.returnBook();
		
	}

}
