package javaPracticeProblems;

public class longestSumarrayPositives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {2,3,5,1,9,10};
        int k = 20;
        System.out.print(longestSubarrayWithSumK(a,k));
	}
	
	public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        
        int n =  a.length;

        int left= 0, right = 0;
        long sum = 0;
        int maxlen = 0;

        for(right=0;right<n;right++){
            sum+=a[right];
            while(sum>k){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxlen = Math.max(maxlen,right-left+1);
            }
        }
        return maxlen;
    }

}
