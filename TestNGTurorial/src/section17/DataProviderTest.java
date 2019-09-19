package section17;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getData")
	public void APILogin(String username, String password){
		
		System.out.println("APILogin test");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st - username password - good credit history
		//2nd - username password - no credit history
		//3rd - username password - fraud credit history
		
		Object[][] data = new Object[3][2];
		
		//1st
		data[0][0] = "firstUserName";
		data[0][1] = "firstPassword";
		
		//2nd
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPassword";
		
		//3rd
		data[2][0] = "thirdUserName";
		data[2][1] = "thirdPassword";
		
		return data;
	}
	

}
