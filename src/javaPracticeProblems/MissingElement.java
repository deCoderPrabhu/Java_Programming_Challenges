package javaPracticeProblems;

public class MissingElement {

public static void main(String[] args) {
        
		int[] a= {12,8,21,10,26,4,11,17,30,2,14,23,18,22,15,24,9,25,3,16,1,5,13,29,27,28,7,19,20};
        int N = 30;
        int result = MissingElementinArray(a,N);
        System.out.println(result);
    }
    public static int MissingElementinArray(int[] a, int N){
        int num = 0, sum=0;
        num = (N*(N+1))/2;
        
        for(int j=0;j<a.length;j++){
            sum = sum + a[j];
        }
        if(num!=sum){
            num = num-sum;
        }
        return num;
    }

}
