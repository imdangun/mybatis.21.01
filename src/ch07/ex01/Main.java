package ch07.ex01;

import ch07.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		for(User user: mapper.selectUsers())
			System.out.println(user);
	}
}
/*
1 john 2025-05-05
2 king 2025-05-15
*/  