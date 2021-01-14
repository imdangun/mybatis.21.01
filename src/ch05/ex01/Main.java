package ch05.ex01;

import java.util.List;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> userList = mapper.selectUsers(new Search("john", null));
		// [1 john 2025-05-05 [정의 너와 나의 연대고리, 사랑 너와 나의 연결고리]]
		
		userList = mapper.selectUsers(new Search("john", new Post("정의", "")));
		// [1 john 2025-05-05 [정의 너와 나의 연대고리]]	
		
		userList = mapper.selectUsers(new Search("john", new Post(null, "고리")));
		// [1 john 2025-05-05 [사랑 너와 나의 연결고리, 정의 너와 나의 연대고리]]
		
		System.out.println(userList);
	}
}
