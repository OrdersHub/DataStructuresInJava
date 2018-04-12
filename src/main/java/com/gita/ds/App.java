package com.gita.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<Integer>  temp = new ArrayList<Integer>();
        temp.add(1);
        
    }
    
    public int add(int x, int y) {
    	return x + y;
    }
    
    public boolean isEven(int x) {
    	if (x % 2 == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
}
