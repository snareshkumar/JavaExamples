package com.naresh.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer finalValue = 100;
	private String testValue = "SerializationTest";
	

	public static void main(String[] args) throws IOException {
		
		Serialization serialization = new Serialization();
		FileOutputStream fout=new FileOutputStream("test.txt"); 
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(serialization);
		obj.flush();
		obj.close();
		
	}

}
