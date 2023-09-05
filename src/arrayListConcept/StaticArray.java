package arrayListConcept;

import java.util.Arrays;

public class StaticArray {
	
	/*
	 * Write a program to create a static Array, having following cricket data:
	 * --name, age, team name, DOB, gender, Strike Rate
	 * --Try to create multiple Object Arrays for different players 
	 * --Try to print all the values of each player on the console
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Object a[]= new Object[6];
		 a[0]="Subbu";
		 a[1]=25;
		 a[2]="Chennai Super Kings";
		 a[3]="1998/04/24";
		 a[4]="M";
		 a[5]=92.92;
		 
		 System.out.println(Arrays.toString(a));
		 
		 Object b[]= {"Swecha",3,"Mumbai Indians","2020/05/24","F",201.23};
		 Object c[]= {};
		 
		 
		 
	}

}
