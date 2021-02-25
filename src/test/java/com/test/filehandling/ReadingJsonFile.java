package com.test.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.processing.Filer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadingJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		String filePath= System.getProperty("user.dir")+"//src//test//java//com//test//filehandling//"+"test.json";
		FileReader reader = new FileReader(filePath);
		JSONParser parser = new JSONParser();
		
		JSONObject obj = (JSONObject) parser.parse(reader);
		
		//JSONObject obj1= (JSONObject) new JSONParser().parse(new FileReader(filePath));
		
		//System.out.println(obj.toJSONString());
		
		//System.out.println(obj.get("testdata"));
		
		
		JSONArray testData= (JSONArray) obj.get("testdata");
		
		
		System.out.println(testData.toJSONString());
		/*
		System.out.println(testDArray);
		
		JSONObject testdetails = (JSONObject) testDArray.get(0);
		
		System.out.println(testdetails);
		
		String testname= (String) testdetails.get("testname");
		
		System.out.println(testname);
		
		JSONArray datArr=(JSONArray) testdetails.get("data");
		
		System.out.println(datArr.toJSONString());
		
		JSONObject testDataset = (JSONObject) datArr.get(0);
		
		String username = (String) testDataset.get("username");
		
		System.out.println(username);
		*/
		
		/*
		for(int i=0; i<testData.size(); i++)
		{
			JSONObject testDetails = (JSONObject) testData.get(i);
			
			String testName = (String) testDetails.get("testname");
			JSONArray data = (JSONArray) testDetails.get("data");
			
			for (int j=0; j<data.size(); j++)
			{
				JSONObject testDataSet = (JSONObject) data.get(j);
				
				String runmode = (String) testDataSet.get("runmode");
				String password = (String) testDataSet.get("password");
				String browser = (String) testDataSet.get("browser");
				String username = (String) testDataSet.get("username");
				
				System.out.println(runmode +" "+password+" "+browser+" "+username);
			}
			
		}
		*/
		
		// reading keys dynamically from Json file
		
		
		for(int i=0; i<testData.size(); i++)
		{
			JSONObject testDetails = (JSONObject) testData.get(i);
			
			String testName = (String) testDetails.get("testname");
			JSONArray data = (JSONArray) testDetails.get("data");
			
			for (int j=0; j<data.size(); j++)
			{
				JSONObject testDataSet = (JSONObject) data.get(j);
				
				Set<String> keys = testDataSet.keySet();
				Iterator itr =keys.iterator();
				
				while (itr.hasNext())
				{
					String key=(String) itr.next();
					String value = (String) testDataSet.get(key);
					
					System.out.print(key + " : "+value +" , " );
				}
				
				System.out.println();
				
			}
			
		}
		
		
		
		
		
	}

}
