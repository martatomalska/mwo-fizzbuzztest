package main;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			System.out.println(fizzBuzzOrNumber(i));
		}

	}
	
	
	public static String fizzBuzzOrNumber (int number) {
		
		StringBuilder sb = new StringBuilder();
		
		if (number % 3 == 0) {
			sb.append("Fizz");
		}
		
		if (number % 5 == 0) {
			sb.append("Buzz");
		}
		
		if (sb.length() == 0) {
			sb.append(number);
		}
		
		return sb.toString();
	}

}
