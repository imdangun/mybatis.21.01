package ch03.ex01;

import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		System.out.println(mapper.selectUsers());
	}
}
/*
[1 john 2025-05-05 서울시 마포구, 2 terry 2025-05-15 성남시 분당구]
*/