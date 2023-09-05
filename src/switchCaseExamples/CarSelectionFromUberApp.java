package switchCaseExamples;

public class CarSelectionFromUberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Mini";
		switch (s) {
		case "Mini":
		case "Sedan":
		case "SUV":
		case "Premium":
			System.out.println("The selected car type:" +s);
		break;
		default:
			System.out.println("Please select the right car type");
			break;
		}

	}

}
