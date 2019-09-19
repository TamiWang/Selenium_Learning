package section17;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGdemo3 {
	
	@Parameters({"Test2-URL"})
	@Test
	public void Login(String urlname) {
		System.out.println("Test folder 2 - Login");
		System.out.println(urlname);
	}

	@Test
	public void AddAccount() {
		System.out.println("Test folder 2 - AddAccount");
	}	
	
	@Test
	public void Logout() {
		System.out.println("Test folder 2 - Logout");
	}
	
	
}
