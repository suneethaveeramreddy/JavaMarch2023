package loops;

public class PrintAllEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("This is even " +i);
			}
			else {
				System.out.println("This is  odd " +i);
			}
		}
		System.out.println("===================");
		int k=1;
		while(k<=100) {
			if(k%2==0) {
				System.out.println("This is even " +k);
			}else {
				System.out.println("This is  odd " +k);
			}
			k++;
		}
		System.out.println("===================");
		int a=1;
		do {
			if(a%2==0) {
				System.out.println("This is even "+a);
			}else {
				System.out.println("This is  odd "+a);
			}
			a++;
		}while(a<=100);
	}

}
