package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Sowpriya.S\\eclipse-workspace\\Maven_ProjectClass\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public  String getUsername() {
		String user = p.getProperty("username");
		return user;		
	}
	
	public String getPassword() {
		String pass = p.getProperty("password");
		return pass;
	}
}
