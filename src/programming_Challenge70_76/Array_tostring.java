package programming_Challenge70_76;

public class Array_tostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder Str = new StringBuilder();
		String[] arr = {"Hello", "World","Welcome","to","program"};
		
		for(int i = 0;i<arr.length;i++) {
			String sb = new String();
			Str.append(arr[i]+" ");
		}
		System.out.println("The Updated string is:\n"+Str);

	}

}
