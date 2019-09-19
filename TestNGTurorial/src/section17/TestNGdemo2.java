package section17;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo2 {
	
	@Test
	public void DemoOne() {
		System.out.println("DemoOne");
	}
	
	@Parameters({"URL", "Username"})
	@Test
	public void DemoTwo(String urlname, String Username) {
		System.out.println("DemoTwo");
		System.out.println(urlname);
		System.out.println(Username);
	}
	
	// Skip this particular test case
	@Test(enabled=false)
	public void DemoThree() {
		System.out.println("DemoThree");
	}	
	
	// groups tag
	@Test(groups={"SmokeTest"})
	public void MobileDemoFive() {
		System.out.println("MobileDemoFive");
	}
	
	@Test(timeOut=4000)
	public void MobileDemoSix() {
		System.out.println("MobileDemoSix");
	}

	// Test cases run based on alphabet order
	// dependsOnMethods tag will change the order
	@Test(dependsOnMethods= {"MobileDemoSix"})
	public void APILogin() {
		System.out.println("APILogin");
	}
}
