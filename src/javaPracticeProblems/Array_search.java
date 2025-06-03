package javaPracticeProblems;

import java.util.Scanner;

public class Array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int[]arr  =new int[n];
			
			for(int i =0;i<n;i++) {
				System.out.println("Enter the element:\t");
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the value to be searched");
			int x = sc.nextInt();
			int value = search(arr,x);
			System.out.println("The index of the serached value is: \t" + value);
			t--;
		}
		

	}
	
	static int search(int arr[], int x) {

        // Your code here
        int i=0;
        for(int num : arr){
            if(num == x){
                return i; 
            }
            i++;
        }
        
        return -1;
        
    }

}
