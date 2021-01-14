package ch05.ex03;

import java.util.List;

import ch05.domain.Post;
import ch05.domain.Search;
import ch05.domain.User;
import config.Configuration;

public class Main {
	public static void main(String[] args) {
		Map mapper = Configuration.getMapper(Map.class);
		
		List<User> userList = mapper.selectUsers(new Search(null, new Post(null, "고리")));
		// [1 john 2025-05-05 [사랑 너와 나의 연결고리, 정의 너와 나의 연대고리]]
		
		userList = mapper.selectUsers(new Search(null, new Post("사랑", "고리")));
		// [1 john 2025-05-05 [사랑 너와 나의 연결고리]]
		
		userList = mapper.selectUsers(new Search(null, new Post(null, null)));
		// [1 john 2025-05-05 [정의 너와 나의 연대고리, 사랑 너와 나의 연결고리], 
		//  2 terry 2025-05-15 [비빔밥 동학농민항쟁이 만든 음식이다., 찹쌀떡 네가 그리워., 김치 네가 있어야 밥을 먹지]]
		
		System.out.println(userList);
	}
}
