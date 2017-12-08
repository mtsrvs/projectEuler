package org.exercise2;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final double LIMIT = 4000000;
	
    public static void main( String[] args )
    {
    	double prev = 0;
    	double curr = 1;
    	double aux = 0;
    	double result = 0;
    	
    	while(curr < LIMIT) {
    		System.out.println(curr);
    		if(curr%2 == 0)
    			result += curr;

    		aux = curr;

    		curr = Fibonacci.next(prev, curr);
    		prev = aux;    		
    	}
    	
    	System.out.println(String.format("result: %.0f", result));
    }
}
