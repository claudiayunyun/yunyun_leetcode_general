package LeetCode.General;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		int longestLen = 0;
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				i = map.get(s.charAt(i));
				longestLen = Math.max(map.keySet().size(), longestLen);
				map.clear();
			} else {
				map.put(s.charAt(i), i);
			}
		}
        return Math.max(map.keySet().size(), longestLen);
    }

}
