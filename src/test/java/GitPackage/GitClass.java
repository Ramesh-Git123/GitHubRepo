package GitPackage;
import org.testng.annotations.Test;

public class GitClass {
	@Test(priority=1)
	void login()
	{
		System.out.println("Login application");
		System.out.println("After changed in project");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Logoout application");
		System.out.println("Update code from local");
	}
	
	@Test(priority=2)
	void openapp()
	{
		System.out.println("Open application");
	}

}
