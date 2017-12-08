package org.exercise4;

public class NumberUtils {

	public static Long reverse(Long number) {
		Long reverse = 0L;
		Long num = number;
		
		while(num != 0) {
			reverse = reverse *10;
			reverse = reverse + num % 10;
			num = num/10;
		}
		
		return reverse;
	}
}
