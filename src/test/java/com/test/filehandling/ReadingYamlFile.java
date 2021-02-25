package com.test.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadingYamlFile {

	public static void main(String[] args) throws FileNotFoundException, YamlException {

		String filePath= System.getProperty("user.dir")+"//src//test//java//com//test//filehandling//"+"test.yml";
		
		YamlReader reader = new YamlReader(new FileReader(filePath));
		
		Map map = (Map) reader.read();
		
		System.out.println(map);
		
		List datasets = (List) map.get("testdata");
		/*
		System.out.println(datasets);
		
		Map dataset = (Map)datasets.get(0);

		System.out.println(dataset);
		
		String testname1 = (String) dataset.get("testName");
		
		System.out.println(testname1);
		
		List currentTestDatasets = (List) dataset.get("data");
		
		System.out.println(currentTestDatasets);
		
		for (int i=0;i<currentTestDatasets.size();i++)
		{
			Map currentTestData = (Map) currentTestDatasets.get(i);
			
			//System.out.println(currentTestData);
			
			String runmode = (String) currentTestData.get("runmode");
			String browser = (String) currentTestData.get("browser");
			String email = (String) currentTestData.get("email");
			String password = (String) currentTestData.get("password");
			
			System.out.println(runmode+" "+browser+" "+email+" "+password);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		*/
		
		for (int i=0; i<datasets.size(); i++)
		{
			Map testDetails = (Map)datasets.get(i);
			
			System.out.println(testDetails);
			
			String testName = (String) testDetails.get("testName");
			System.out.println(testName);
			
			List data = (List)testDetails.get("data");
			System.out.println(data);
			for (int j=0; j<data.size();j++)
			{
				Map testDataSet = (Map) data.get(j);
				Set<String> keys =  testDataSet.keySet();
				
				for(String key : keys)
				{
					//String key=(String) itr.next();
					String value = (String) testDataSet.get(key);
					
					System.out.print(key + " : "+value +" , " );
				}
				
				System.out.println();
				
				
			}
			
			
			
		}
		
		
	}

}
