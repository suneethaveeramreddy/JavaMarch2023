package ForLoop;

public class ReverseOrderInForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object emp[]= new Object[5];
		emp[0]="Tom";
		emp[1]=25;
		emp[2]=12.33;
		emp[3]='M';
		emp[4]=true;
		
		int count=5;
		for(Object e:reversed(emp)) {
			System.out.println(count+"="+e);
			count--;
		}
	}

	private static Object[] reversed(Object[] emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
