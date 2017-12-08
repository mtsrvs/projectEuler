package org.exercise5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Factor {

	public static Map<Integer, Integer> factors(int number) {
		Set<Integer> f = new HashSet<Integer>();
		
		for(int i = 2; i <= number; i++) {
			if(number % i == 0) {
				validFactor(f, i);
			}
		}
		
		return times(f, number);
	}
	
	private static void validFactor(Set<Integer> f, int i) {
		for(Integer fac: f) {
			if(i % fac == 0) {
				return;
			}
		}
		
		f.add(i);
	}
	
	private static Map<Integer, Integer> times(Set<Integer> f, int number) {
		int num = number;
		Map<Integer, Integer> times = new HashMap<Integer, Integer>();
		int counter = 0;
		
		for(Integer fac: f) {
			
			while(num % fac == 0) {
				num /= fac;
				counter++;
			}
			
			times.put(fac, counter);
			counter = 0;
		}
		
		return times;
	}
}
