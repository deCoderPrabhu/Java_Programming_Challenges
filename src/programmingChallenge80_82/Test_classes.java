package programmingChallenge80_82;

public class Test_classes extends LibraryItem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem item1 = new LibraryItem();
		System.out.println(item1);
		
		Book Design = new Book();
		System.out.println(Design);
		System.out.println();
		Design.checkout();
		Design.returnitem();
		
		Magazine fashion  = new Magazine();
		System.out.println(fashion);
		fashion.checkout();
		fashion.returnitem();
		
		Person per1  = new Person(21,"Nishant");
		Person per2 = new Person(21,"Nishant");
		
		if(per1.equals(per2)) {
			System.out.println("Equals");
			System.out.println(per1.hashCode() + "\n"+ per2.hashCode());
		}else {
			System.out.println("Not Equals");
			System.out.println(per1.hashCode() + "\n"+per2.hashCode());
		}
	}

}
