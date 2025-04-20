package com.Array;

import java.util.HashMap;
import java.util.Map;

public class Telus {

	public static void main(String[] args) {
	String name = "Kartikey";
		 Integer zip = 12345;
		Map<String, Integer> map = new HashMap<String, Integer>();
			map.put(name, zip);
			
			for(Map.Entry<String, Integer>entry:map.entrySet()) {
				System.out.println(entry+"--->"+map.entrySet());
				
			}
		

	}

}
