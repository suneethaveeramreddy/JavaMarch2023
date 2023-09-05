package loops;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			System.out.println("Hello World");
			i++;
		}
		System.out.println("============");
		int j=1;
		do {
			System.out.println("Hello World");
			j++;
		}while(j<=10);
		System.out.println("============");
		
		for(int K=1;K<=10;K++) 
		{	
			System.out.println("Hello World");
		}
	}

}
