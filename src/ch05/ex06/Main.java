package ch05.ex06;

import java.util.Arrays;
import java.util.List;

import ch05.domain.each.Search;
import ch05.domain.each.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> userList = mapper.selectUsers(new Search(new int[]{1, 2}, null));
		// [1 john 2025-05-05, 2 king 2025-05-15]
		
		userList = mapper.selectUsers(new Search(null, Arrays.asList("john", "king")));
		// [1 john 2025-05-05, 2 king 2025-05-15]
		
		System.out.println(userList);
	}
}
