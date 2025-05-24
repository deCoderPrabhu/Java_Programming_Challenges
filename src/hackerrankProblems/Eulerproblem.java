package hackerrankProblems;

import java.util.Scanner;

public class Eulerproblem {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(multipleSum(n));
        }
    }
    
    public static long multipleSum(int n){
        int sum=0;
        if(n==0){
            return n; 
        }
        for(int i=1;i<n;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }

}
