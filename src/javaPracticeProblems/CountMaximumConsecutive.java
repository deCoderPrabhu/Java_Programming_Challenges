package javaPracticeProblems;

public class CountMaximumConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 1, 0, 1, 1, 1};
        System.out.print(maximumConsecutive(a));

	}
	
	public static int maximumConsecutive(int[] a){
        int count  = 0, i= 0, max_count=0;
        while(i<a.length){
            if(a[i] == 1){
                count++;
                if(count>max_count){
                    max_count = count;
                }
            }else{
                count = 0;
            }
            
            i++;
        }
        return max_count;
    }

}
