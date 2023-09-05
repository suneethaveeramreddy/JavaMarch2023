package arrayListConcept;

import java.util.Arrays;

public class WAPStaticArrayCricketData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ply1[]=new Object[6];
		Object ply2[]=new Object[6];
		Object ply3[]=new Object[6];
		
		ply1[0]="Dhoni";
		ply1[1]=32;
		ply1[2]="Chennai Super Kings";
		ply1[3]="1990/05/24";
		ply1[4]='M';
		ply1[5]=136.3;
		
		ply2[0]="Sachin";
		ply2[1]=35;
		ply2[2]="Mumbai Indians";
		ply2[3]="1987/04/24";
		ply2[4]='M';
		ply2[5]=119.82;
		
		ply3[0]="Virat";
		ply3[1]=30;
		ply3[2]="Royal Challengers Bangalore";
		ply3[3]="1992/10/27";
		ply3[4]='M';
		ply3[5]=115.99;
		
		System.out.println(Arrays.toString(ply1));
		System.out.println(Arrays.toString(ply2));
		System.out.println(Arrays.toString(ply3));

	}

}
