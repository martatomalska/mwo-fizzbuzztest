package main;

import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzTest {
	
//	FizzBuzz fizz = new FizzBuzz();
	
	
	@Test
	public void testIfFizzBuzzPrintsNumbers() {
		Assert.assertEquals("1", FizzBuzz.fizzBuzzOrNumber(1));
		Assert.assertEquals("23", FizzBuzz.fizzBuzzOrNumber(23));		
	}
	
	@Test
	public void testIfFizzBuzzPrintsFizz() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzzOrNumber(3));
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzzOrNumber(27));
	}
	
	@Test
	public void testIfFizzBuzzPrintsBuzz() {
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzzOrNumber(5));
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzzOrNumber(125));		
	}
	
	@Test
	public void testIfFizzBuzzPrintsFizzBuzz() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzzOrNumber(15));				
		Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzzOrNumber(45));				
	}
	

}
