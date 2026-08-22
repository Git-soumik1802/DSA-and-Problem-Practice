package mock4;

import java.util.ArrayList;
import java.util.List;

public class GroupOfAnangram {
	public static String sort(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < ch[min]) {
					min = j;
				}
			}
			char temp = ch[i];
			ch[i] = ch[min];
			ch[min] = temp;
		}
		return String.valueOf(ch);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> l2 = new ArrayList();

		for (int i = 0; i < strs.length; i++) {
			boolean found = false;
			for (List<String> group : l2) {
				if (sort(group.get(0)).equals(sort(strs[i]))) {
					group.add(strs[i]);
					found = true;
					break;
				}
			}
			if (!found) {
				List<String> list = new ArrayList<>();
				list.add(strs[i]);
				l2.add(list);
			}
		}

		return l2;

	}

	public static void main(String[] args) {
		String[] strs = {
	            "eat", "tea", "tan", "ate", "nat", "bat"
	        };

	        List<List<String>> result = groupAnagrams(strs);

	        System.out.println(result);
	    }

	}


