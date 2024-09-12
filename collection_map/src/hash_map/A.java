package hash_map;

import java.util.HashMap;

public class A {
	public static void main(String[] args) {
		HashMap<Integer,String> studentInfo = new HashMap<>();
		studentInfo.put(100, "irfan");
		studentInfo.put(200, "Aman");
		studentInfo.put(300, "Pankaj");
		studentInfo.put(301, "Pankaj");
		studentInfo.put(302, "Pankaj");
		studentInfo.put(303, "Pankaj");
		studentInfo.put(304, "Pankaj");
		studentInfo.put(101, "irfan");
		studentInfo.put(201, "Aman");
		studentInfo.put(102, "irfan");
		studentInfo.put(202, "Aman");
		
		studentInfo.put(105, "irfan");
		studentInfo.put(205, "Aman");
		studentInfo.put(301, "Pankaj");
		studentInfo.put(321, "Pankaj");
		studentInfo.put(332, "Pankaj");
		studentInfo.put(363, "Pankaj");
		studentInfo.put(394, "Pankaj");
		studentInfo.put(191, "irfan");
		studentInfo.put(271, "Aman");
		studentInfo.put(152, "irfan");
		studentInfo.put(282, "Aman");
		
		
		System.out.println(studentInfo);// it print all key and value
		System.out.println(studentInfo.get(100)); // it return value 
		System.out.println(studentInfo.values()); // it return only all value
		System.out.println(studentInfo.keySet());// it return only all keys
		
	}
}
