package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void loan()
	{
		System.out.println("Good");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Me First");
	}
}
