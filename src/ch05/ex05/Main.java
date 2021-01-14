package ch05.ex05;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.selectUsers("king")); 
		// [2 king 2025-05-15 null]
	}
}
