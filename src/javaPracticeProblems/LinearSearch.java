package javaPracticeProblems;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,1,2,4,5};
		int num = 8;
		
		System.out.print("The search element is :" );
		if(searchInSorted(arr, num)) {System.out.print(" Present");}else {System.out.print(" Not Present");}

	}
	static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int i = 0;
        while(i<=arr.length-1){
            if(arr[i]==k){
                return true;
            }
            i++;
        }
        return false;
    }

}
