package javaPracticeProblems;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		rotateArray(arr,n);
		System.out.println(arr);
	}
	
	static int[] rotateArray(int[] arr, int n) {
        // Write your code here.

        //Code to print the result for array length 0/1
        if(n == 1){
            return arr;
        }

        int rotNum = arr[0];

        for(int i=0; i<=n-2;i++){
            int temp = arr[i+1];
            arr[i]=temp;
            arr[i+1]=rotNum;
        }

        return arr;
    }

}
