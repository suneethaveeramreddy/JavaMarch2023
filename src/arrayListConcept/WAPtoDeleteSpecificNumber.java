package arrayListConcept;

import java.util.Arrays;

public class WAPtoDeleteSpecificNumber {
	
	/*
	 * Q1: WAP to delete a specific number from the given array. int p[] =
	 * {1,4,5,2,3,22,31, 2}; --Need to remove 22 from the p[] array. --output should
	 * be: [1, 4, 5, 2, 3, 31, 2]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[]= {1,4,5,2,3,22,31,2};
		int a[]=new int[p.length-1];
		int j=0;
		for(int i=0;i<p.length;i++) {
			if(p[i]!=22) {
			a[j]=p[i];
			j++;
			}	
		}
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(a));
	}
}
