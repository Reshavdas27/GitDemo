package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

		@AfterTest
		public void lastexecution()
		{
			System.out.println("Atlast");
			System.out.println("Atlast2");
		}
	@Test
	public void Demo()
	{
		System.out.println("hello");
	}
	@Test
	public void Demo2()
	{
		System.out.println("Bye");
	}
}
