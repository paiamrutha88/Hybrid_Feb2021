package com.test.filehandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatingJsonFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Json file
		
		JSONObject student1 = new JSONObject();
		
		JSONObject subjects = new JSONObject();
		
		subjects.put("major1", "English");
		subjects.put("major2", "Hindi");
		subjects.put("major3", "Kannada");
		
		student1.put("name", "Deeksha");
		student1.put("RollNo", 10);
		student1.put("HasEnrolledForUPSE", true);
		student1.put("SubjectsOpted", subjects);
		
		JSONObject student2 = new JSONObject();
		student2.put("name", "Pravin");
		student2.put("RollNo", 20);
		student2.put("HasEnrolledForUPSE", false);
		//student2.put("SubjectsOpted", subjects);
		
		JSONArray arrayDet = new JSONArray();
		arrayDet.add(student1);
		arrayDet.add(student2);
		
		JSONObject StudentDetails = new JSONObject();
		StudentDetails.put("StudentDetails", arrayDet);
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		System.out.println(StudentDetails.toJSONString());

		
	}

}
