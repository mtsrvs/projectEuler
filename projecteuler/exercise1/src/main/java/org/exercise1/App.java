package org.exercise1;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final double NUMBER = 1000;
	
    public static void main( String[] args )
    {
    	double sum = 0;
    	
    	for(double i = 0; i < NUMBER; i++) {
    		if(multipleOfThree(i) || multipleOfFive(i)) {
    			sum += i;
    		}
    	}
    	
    	System.out.println(String.format("sum: %.0f", sum));
    }
    
    private static boolean multipleOfThree(double number) {
    	return number % 3 == 0;
    }
    
    private static boolean multipleOfFive(double number) {
    	return number % 5 == 0;
    }
}
