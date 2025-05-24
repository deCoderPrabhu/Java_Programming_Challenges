package arrayMethod;

import java.util.Scanner;

public class EquibilliumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[]arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(equiPoint(arr));
            t--;
        }
        sc.close();

	}
	
	public static int equiPoint(int[] arr){
        int n = arr.length;
        int totalsum =0;
        
        if(n<=1){
            return n;
        }
        
        for(int num:arr){
            totalsum+=num;
        }
        
        int leftsum=0;
        for(int i=0;i<n;i++){
            if(leftsum==(totalsum-leftsum-arr[i])){
                return i+1;
            }
            leftsum+=arr[i];
        }
        return -1;
	}
	

}
