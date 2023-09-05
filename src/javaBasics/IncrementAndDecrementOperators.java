package javaBasics;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		int y=++x;
		
		System.out.println(x);
		System.out.println(y);
		
		int pop=8;
		System.out.println(++pop);
		System.out.println(pop);
		
		char ch1='$';
		System.out.println(ch1);
		System.out.println(++ch1);
				
		int e1=2;
		int e2=e1++ + ++e1;
		System.out.println(e1);
		System.out.println(e2);
		
		int s1=1;
		int s2=2;
		
		System.out.println(--s2 - ++s1 + ++s2 - --s1);
		System.out.println(s1);
		System.out.println(s2);
		
//		int a=1,b=2;
//		int i=1, j=2, k=3;
//		int m=i-- -j-- -k--;
//		System.out.println("i="+i);
//		System.out.println("i="+j);
//		System.out.println("i="+k);
//		System.out.println("i="+m);
//		System.out.println(--b- ++a+ ++b- --a);
		
		
//		int i=19, j=29, k;
//
//		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//
//		System.out.println("i="+i);
//
//		System.out.println("j="+j);
//
//		System.out.println("k="+k);
		
//		int i = 11;
//		int j = --(i++);
//		
//		System.out.println(i);
//		System.out.println(j);
		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//
//		System.out.println(p);
//		
//		int a=1;
//
//		a = a++ + ++a * --a - a--;
//
//		System.out.println(a);
			
		int ch = 'A';

		System.out.println(++ch);
		
		double d = 1.5, D = 2.5;

		System.out.println(d++ + ++D);
	}

}
