
package com;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



	public class Reader {
	    public static Reader instance;
	    private static Scanner reader;

	    private Reader() {

	    }

	    public static Reader getInstance() {
	        if (instance == null) {
	            instance = new Reader();
	        }
	        return instance;
	    }

	    public int readIntValue() throws IOException {
	        reader = new Scanner(new InputStreamReader(System.in));
	        return Integer.parseInt(reader.next());
	    }

	    public char readCharValue() throws IOException {
	        reader = new Scanner(new InputStreamReader(System.in));
	        return reader.next().charAt(0);
	    }

	}


