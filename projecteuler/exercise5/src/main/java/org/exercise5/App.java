package org.exercise5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Map<Integer,Integer>> list = new ArrayList<Map<Integer,Integer>>();
    	Map<Integer,Integer> factors = new HashMap<Integer,Integer>();
    	
    	Double proc = 1.0;
    	
    	for(int i = 1; i <= 20; i++) {
    		list.add(Factor.factors(i));
    	}
    	
    	for(Map<Integer,Integer> m: list) {
    		for(Integer k: m.keySet()) {
    			if(!factors.containsKey(k)) {
    				factors.put(k, m.get(k));
    			} else if(factors.get(k) < m.get(k)) {
    				factors.put(k, m.get(k));
    			}
    		}
    	}
    	
    	for(Integer key: factors.keySet()) {
    		proc *= Math.pow(key, factors.get(key));
    	}
    	
    	System.out.printf("proc: %f\n", proc);
    }
}
