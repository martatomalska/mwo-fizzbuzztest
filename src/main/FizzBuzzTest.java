package main;

import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzTest {
	
	FizzBuzz fizz = new FizzBuzz();
	
	
	@Test
	public void testIfFizzBuzzPrintsNumbers() {
		Assert.assertEquals("1", fizz.fizzBuzzOrNumber(1));
		Assert.assertEquals("23", fizz.fizzBuzzOrNumber(23));		
	}
	
	@Test
	public void testIfFizzBuzzPrintsFizz() {
		Assert.assertEquals("Fizz", fizz.fizzBuzzOrNumber(3));
		Assert.assertEquals("Fizz", fizz.fizzBuzzOrNumber(27));
	}
	
	@Test
	public void testIfFizzBuzzPrintsBuzz() {
		Assert.assertEquals("Buzz", fizz.fizzBuzzOrNumber(5));
		Assert.assertEquals("Buzz", fizz.fizzBuzzOrNumber(125));		
	}
	
	@Test
	public void testIfFizzBuzzPrintsFizzBuzz() {
		Assert.assertEquals("FizzBuzz", fizz.fizzBuzzOrNumber(15));				
		Assert.assertEquals("FizzBuzz", fizz.fizzBuzzOrNumber(45));				
	}
	

}
