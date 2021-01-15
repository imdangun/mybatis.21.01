package ch05.domain.each;

import java.util.List;

public class Search {
	private int[] userIds;
	private List<String> userNames;
	
	public Search(int[] userIds, List<String> userNames) {
		this.userIds = userIds;
		this.userNames = userNames;
	}
}
