package com.test.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop=new Properties();
		String path="project.properties";
		
		System.out.println(System.getProperty("user.dir"));
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\test\\filehandling\\"+path);
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
	}

}
