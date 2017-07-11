package com.shc.oops;

abstract class Product { 
    int multiplyBy;
    public Product( int multiplyBy ) {
    	System.out.println("Super constructor");
        this.multiplyBy = multiplyBy;
    }

    abstract int mutiply(int val) ;
}

class TimesTwo extends Product {
    public TimesTwo() {
        super(2);
    }
    
    public int mutiply(int val) {
        return multiplyBy * val;
     }
}

class TimesWhat extends Product {
    public TimesWhat(int what) {
        super(what);
    }
    
    public int mutiply(int val) {
        return multiplyBy * val;
     }
}

public class AbstractExample {

	public static void main(String[] args) {

		Product timesTwo = new TimesTwo();
		timesTwo.mutiply(3);
	}

}
