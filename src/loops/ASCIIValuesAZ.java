package loops;

public class ASCIIValuesAZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='0';c<='9';c++) {
			System.out.println((byte)c+" "+c);
		}
		for(char c='A';c<='Z';c++) {
			System.out.println((byte)c+" "+c);
		}
		for(char c='a';c<='z';c++) {
			System.out.println((byte)c+" "+c);
		}
		System.out.println("======================");
		char a='0';
		while(a<='9') {
			System.out.println((byte)a+" "+a);
			a++;
		}
		
	}

}
