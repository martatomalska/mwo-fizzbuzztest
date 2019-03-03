package main;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			System.out.println(fizzBuzzOrNumber(i));
		}

	}
	
	
	public static String fizzBuzzOrNumber (int number) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(number);
		
		return sb.toString();
	}

}
