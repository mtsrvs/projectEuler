package org.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Long min = 100L;
    	Long max = 999L;
    	Long number = 0L;
    	Long reverse = 0L;
    	
    	Set<Long> palindrome = new HashSet<Long>();
    	
    	for(Long i = min; i <= max; i++) {
    		for(Long j = min; j <= max; j++) {
    			number = i*j;
    			reverse = NumberUtils.reverse(number);
    			if(reverse - number == 0) {
    				palindrome.add(reverse);
    			}
    		}
    	}

    	List<Long> list = new ArrayList<Long>(palindrome);
    	
    	Collections.sort( list, new Comparator<Long>() {
			public int compare(Long o1, Long o2) {
				return o1.compareTo(o2);
			}
		});
    	
    	System.out.println("palindrome: " + list.get(0));
    	System.out.println("palindrome: " + list.get(list.size() - 1));
    }
}
