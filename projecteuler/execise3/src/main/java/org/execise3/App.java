package org.execise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Long NUM = 600851475143L;
	
    public static void main( String[] args )
    {
    	List<Long> factor = new ArrayList<Long>();
    	Long number = 1L;
    	
    	while(!hasEnd(factor, NUM)) {
    		if(NUM % number == 0) {
    			validFactor(factor, number);
    		}
    		number += 2; //all the numbers must be odd.
    	}
    	
        System.out.println(String.format("largest prime factor: %d",factor.get(factor.size() - 1)));
    }
    
    private static void validFactor(List<Long> factor, Long number) {
    	for(Long f: factor) {
    		if(f != 1) {
    			if(number % f == 0) {
    				return;
    			}
    		}
    	}
    	factor.add(number);
    }
    
    private static boolean hasEnd(List<Long> factor, Long number) {
    	Long factors = 1L;
    	
    	if(factor.isEmpty())
    		return false;
    	
    	for(Long f: factor) {
    		factors *= f;
    	}
    	
    	return (factors - number) == 0;
    }
}
