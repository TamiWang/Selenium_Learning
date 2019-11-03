package section18;

import java.io.IOException;

import org.testng.annotations.Test;

// Reuse component by using extends keyword

public class ReuseComponent extends PropertiesDemo{
	
	@Test
	public void OpeningBrowser() throws IOException {
		Login();
	}
	

}
