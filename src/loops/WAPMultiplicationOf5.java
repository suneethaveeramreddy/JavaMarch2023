package loops;

public class WAPMultiplicationOf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i%5==0) {
				System.out.println(i);
			}
		}
		System.out.println("===========");
		int k=1;
		while(k<=100) {
			if(k%5==0) {
				System.out.println(k);
			}
			k++;
		}
		System.out.println("===========");
		int a=1;
		do {
			if(a%5==0) {
				System.out.println(a);
			}
			a++;
		}while(a<=100);
	}

}
