package javaPracticeProblems;

public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(isSorted(a.length, a)); // Output: 1 (sorted)

        int[] unsortedArray = {5, 3, 4, 1, 2};
        System.out.println(isSorted(unsortedArray.length, unsortedArray)); // Output: 0 (not sorted)

	}
	
	public static int isSorted(int n, int []a) {
        
        //if array has 0 or 1 element it is considered sorted
        if(n<=1){return 1;}


        //Check if the array is sorted
        for(int i=0;i<n-1;i++){
            if(a[i] > a[i+1]){
                return 0;
            }
        }

        return 1;
        
    }

}
