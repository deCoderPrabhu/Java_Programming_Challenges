package hackerrankProblems;

import java.util.Scanner;

public class Series_problem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        while(q>0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int pow= 0;
            int sum = a;
            for(int j = 0;j<n;j++){
                pow = power(2,j);
                sum += pow*b;
                System.out.print(sum+" ");
            }
            System.out.println();
            q--;
            
        }
        
    }
    public static int power(int base,int exp){
        if(exp == 0){
            return 1;
        }else if(exp < 0){
            return 1/power(base, -exp);
        }else{
            return base * power(base, exp - 1);
        }
    }
}
