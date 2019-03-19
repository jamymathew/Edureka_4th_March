package module6;

import org.testng.annotations.Test;

public class DisableEnable {

	@Test(priority=0, enabled=false)
	public void Soni() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority=12, enabled=false)
	public void Nikendra() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority=32)
	public void Paul() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority=40)
	public void Ajay() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority=55)
	public void Aslan() {
		System.out.println("This is the Test Case 5");
	}

}
