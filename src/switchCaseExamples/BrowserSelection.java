package switchCaseExamples;

public class BrowserSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="hrome";
		if(browser.equals("chrome"))
			{
			System.out.println("Launch chrome");
			}
		else if(browser.equals("Firefox")) 
			{
			System.out.println("Launch Firefox");
			}
		else if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}
		else if(browser.equals("safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the right browser name");
		}
	}

}
