package ch05.ex06;

import java.util.List;

import ch05.domain.each.Search;
import ch05.domain.each.User;

public interface Map {
	List<User> selectUsers(Search search);
}
