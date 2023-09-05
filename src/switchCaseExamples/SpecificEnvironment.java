package switchCaseExamples;

public class SpecificEnvironment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dev";
		switch (s) {
		case("QA"):
			System.out.println("The Given environment is:"+s);
			break;
		case("Stage"):
			System.out.println("The Given environment is:"+s);
			break;
		case("Dev"):
			System.out.println("The Given environment is:"+s);
			break;
		case("UAT"):
			System.out.println("The Given environment is:"+s);
			break;
		case("Prod"):
			System.out.println("The Given environment is:"+s);
			break;
		default:
			System.out.println("Please specify the correct environment");
			break;
		}
		
	}

}
