package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="this is my java code and i am so happy and i am so cool";
		System.out.println(s.length());
//		
//		for (int i=0;i<s.length();i++)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		String mg1 = "your username is naveen";
		String userId =mg1.split("is")[1];
		System.out.println(userId);
		
	}

}
