package com;

public class Runner {

	public static void main (String []args) {
		
		Logic cal = new Logic();
		System.out.print( cal.div(150, 20));
		
		GUICal Calculator =new GUICal();
        Calculator.draw();
	}
}
