package assignments11Apr2023;

public class GreatestNumberOutOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=100;
		int c=87;
		int d=97;
		
		if(a>b) {
			if (a>c)
			{
				if(a>d)
				{
					System.out.println("The greatest number is: "+a);
				}
			}
		}
		else if(b>c) {
			if(b>d)
			{
				System.out.println("The greatest number is:" +b);
			}
		}
		else if(c>d) {
			System.out.println("The greatest number is:" +c);
		}
		else {
			System.out.println("The greatest number is:" +d);
		}
	}


}
