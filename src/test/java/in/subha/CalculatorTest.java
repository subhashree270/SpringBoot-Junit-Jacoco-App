package in.subha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.subha.beans.Calculator;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		Calculator c=new Calculator();
		int actualResult=c.add(20, 30);
		assertEquals(50, actualResult); //assertion it will match expected value with actual value
		//assert method is a static method so we are using static import
	}
	
	@Test
	public void multiplyTest() {
		Calculator c=new Calculator();
		int actualValue=c.multiply(10, 20);
		assertEquals(200,actualValue);
	}
	@Test
	public void fullNameTest() {
		Calculator c=new Calculator();
		String fullName=c.fullName("Subhashree", " Panda");
		assertEquals("Subhashree Panda",fullName);
	}

}
