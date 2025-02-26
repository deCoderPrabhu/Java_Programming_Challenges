package javaPracticeProblems;

public class NumberAppearsOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {4,4,5,1,2,1,2};
        System.out.print(numberAppearsOnce(a));
	}
	
	public static int numberAppearsOnce(int[] a){
        
        //xor all the elements
        int xor =0;
        for(int i=0;i<a.length;i++){
            xor = xor ^ a[i]; 
        }
        
        return xor;
        
    }

}
