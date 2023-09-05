package switchCaseExamples;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='b';
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
			break;
		}
	}

}
