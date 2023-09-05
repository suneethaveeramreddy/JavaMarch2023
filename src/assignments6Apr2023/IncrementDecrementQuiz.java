package assignments6Apr2023;

public class IncrementDecrementQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=11;
		i=i++ + ++i;
		System.out.println(i);
		
		int a=11, b=22, c;
		c= a + b + a++ + b++ + ++a + ++b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
		int j=0;
		j=j++ - --j+ ++j-j--;
		System.out.println(j);
		
		
		
	}

}
