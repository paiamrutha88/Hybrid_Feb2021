package com.test.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadingFromNotepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File fr = new  File("D:\\timesheet\\test.txt");
			
			Scanner sc = new Scanner(fr);
			
			while (sc.hasNext())
			{
			System.out.print(sc.next() +"\n");
			
			
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\timesheet\\test.txt"));
			String currentLine;
			while ((currentLine = br.readLine()) != null)
			{
				System.out.println(currentLine);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
