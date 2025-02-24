package javaPracticeProblems;

import java.util.*;

public class FindUnionOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 2, 3, 4, 6};
		int[] b = {2, 3, 5};
		
		List<Integer> unionArray = sortedArray(a,b);
		for(int i: unionArray) {
			System.out.println(i + " ");
		}

	}
	
	public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i =0, j = 0; //Add the pointer to both arrays
        List<Integer> union = new ArrayList<>(); //create the list to store union elements
        //Case 1 and Case3: If the element in array a is < or = to element in array b
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                if(union.isEmpty() || union.get(union.size()-1) != a[i]){
                    union.add(a[i]);
                }
                i++;
            //if the element in array a is > or = to element in array b
            }else{
                if(union.isEmpty() || union.get(union.size()-1) != b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }

        while(i<a.length){ // IF any element left in arr1
            if(union.isEmpty() || union.get(union.size()-1) != a[i]){
                union.add(a[i]);
            }
            i++;
        }

        while(j<b.length){ // IF any element left in arr2
            if(union.isEmpty() || union.get(union.size()-1) != b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
	}
}
