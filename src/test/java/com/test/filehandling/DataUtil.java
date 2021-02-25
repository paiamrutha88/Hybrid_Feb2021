package com.test.filehandling;

import java.util.Hashtable;



public class DataUtil {
	

	public static void main(String[] args)
	{
		
		System.out.println("inside main");
		String testname="TestA";
		
		Xls_Reader xls = new Xls_Reader("D:\\data1\\SuiteA.xlsx");
		
		int testStartRowNum=1;
		
		
		//System.out.println(testName);
		
		
		
		while (!xls.getCellData("Data", 0, testStartRowNum).equals(testname))
		{
		
			testStartRowNum++;
		}
		
		System.out.println(testStartRowNum);
		
		int colStartRownum=testStartRowNum+1;
		
		
		
		int totalCols =0;
		
		while (!xls.getCellData("Data", totalCols, colStartRownum).equals(""))
		{
			totalCols++;
		}
		
		
		System.out.println("Total columns : " +totalCols);
		
		
		int dataStartRownum=testStartRowNum+2;
		
		
		int totalRows=0;
		while (!xls.getCellData("Data", 0, dataStartRownum).equals(""))
		{
			totalRows++;
			dataStartRownum++;
			
		}
		
		System.out.println("Total rows : " +totalRows);
		dataStartRownum=testStartRowNum+2;
		Hashtable <String, String> table = null;
		//read data
		int finalRows=dataStartRownum+totalRows;
		Object myData[][] = new Object [totalRows][1];
		int i=0;
		for (int rNum=dataStartRownum; rNum<finalRows; rNum++)
		{
			table=new Hashtable<String, String>();
			for (int cNum=0; cNum<totalCols; cNum++)
			{
				String data = xls.getCellData("Data", cNum, rNum);
				String key = xls.getCellData("Data", cNum, colStartRownum);
				table.put(key, data);
				
				//System.out.print(key+" "+data +" ");
			}
			myData[i][0]=table;
			i++;
			System.out.println(table);
		}
		
		
	}
	
}
	
	

