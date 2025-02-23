package javaPracticeProblems;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,0,5,0,3,0,2,0};
		int n = a.length;
		int[] new_a = moveZeros(n,a);
		
		for(int i = 0;i<n;i++) {
			System.out.print(new_a[i] + " ");
		}

	}
	public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        //assign the value -1 to variable j
        int j = -1;

        //check for the first zero in the array
        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        //for non zero element in array
        if(j==-1){return a;}

        //move the zeroes to the end
        for(int i = j+1; i<n;i++){
            if(a[i]!=0){
                //swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;
    }

}
