package section17;

import org.testng.annotations.Test;

public class TestNGdemo1 {
	
	@Test
	public void Demo1() {
		System.out.println("hello");
	}
	
	// using groups tag
	@Test(groups={"SmokeTest"})
	public void Demo2() {
		System.out.println("bye");
	}

}
