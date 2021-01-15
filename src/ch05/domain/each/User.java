package ch05.domain.each;

import java.time.LocalDate;

public class User {
	private int userId;
	private String userName;
	private LocalDate regDate;
	
	@Override
	public String toString() {
		return String.format("%d %s %s", userId, userName, regDate);
	}
}
