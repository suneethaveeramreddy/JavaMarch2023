package classAndObject;

public class EmployeeTest {
	
	public int getEmployeeMarks(String empName) {
		System.out.println("Getting empolyee marks..." +empName); 
		int marks=-1;
		switch (empName) {
		case "Neelam":
			marks=90;
		case "Mitaj":
			marks=95;
		case "Ravi":
			marks=80;
		case "Naveen":
			marks=10;
		default:
			System.out.println("emp name is not found..." +empName);
		}
		return marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeTest et=new EmployeeTest();
		int TotalMarks=et.getEmployeeMarks("suneetha");
		System.out.println(TotalMarks);

	}

}
