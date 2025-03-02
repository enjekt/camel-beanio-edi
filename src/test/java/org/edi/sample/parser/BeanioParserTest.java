package org.edi.sample.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

public class BeanioParserTest {

	    public static void main(String[] args) throws Exception {
	    	StreamFactory factory = StreamFactory.newInstance();
	    	
	    	factory.loadResource("edidefinitions.xml");

	    	// create a BeanReader to read from 'in.txt'
	    	Reader in = new BufferedReader(new FileReader("src/test/resources/purchaseOrder.edi"));
	    	BeanReader beanReader = factory.createReader("ediStream", in);
	    	System.out.println(beanReader.read());
	    
	    }
	
}
