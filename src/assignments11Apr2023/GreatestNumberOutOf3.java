package assignments11Apr2023;

public class GreatestNumberOutOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25;
		int b=78;
		int c=87;
		if(a>b)
		{
			if(a>c) {
				System.out.println("The greatest:" +a);
			}
			else {
				System.out.println("The greatest:" +c);
			}
		}
		if(b>c) 
		{
			System.out.println("The greatest:" +b);
		}
		else {
			System.out.println("The greatest:" +c);
		}
	}

}
