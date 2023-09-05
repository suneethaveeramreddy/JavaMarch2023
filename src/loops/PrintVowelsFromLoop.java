package loops;

public class PrintVowelsFromLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='a';c<='z';c++) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				System.out.println(c+" Vowel");
			}else {
				System.out.println(c+" Consonant");
			}
		}
		
		
		
	}

}
