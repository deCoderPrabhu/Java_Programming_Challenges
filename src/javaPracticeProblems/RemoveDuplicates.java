package javaPracticeProblems;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 6};
		
		int arrLength = removeDuplicates(arr,arr.length);
		System.out.println("Modified Array Length is:" + arrLength);
		
	}
	
	public static int removeDuplicates(int[] arr,int n) {
        // Write your code here.
        //Check if the array length is 0
        if(arr.length == 0){return 0; }

        //Initialize the pointer for the last unique element
        int i = 0;

        //create the for loop to traverse through the array
        for(int j=1;j<n;j++){
            //if the current element is duplicate from the unique element
            if(arr[i]!=arr[j]){
                i++; //Increment of position 
                arr[i] = arr[j];//update the element
            }

        }
        //length of the array without the duplicates
        return i+1;
       

    }

}
