package com.properties;

import java.io.IOException;

public class File_Reader_Manager {

	//private constructor
	private File_Reader_Manager() {
		//It doesn't allow to creating object in another class
	}
	
	//static method
	public static File_Reader_Manager getInstanceFRM(){
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;	//will get object from this class (frm)
	}
	
	//non static method
	public Configuration_Reader getInstanceCR() throws IOException { //frm.getInstanceCR
		Configuration_Reader cr=new Configuration_Reader();
		return cr;//will return cr object
	}
}
