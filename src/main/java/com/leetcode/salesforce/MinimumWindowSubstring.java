package com.leetcode.salesforce;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MinimumWindowSubstring {
	public String minWindowBruteForce(String s, String t) {
		Set<Character> charsSet = t.chars()
			    .mapToObj(e->(char)e).collect(Collectors.toSet());
		String minWindow = "";
		int minWindowSize = Integer.MAX_VALUE;
		for(int i = 0; i < s.length(); i++) {
			if(charsSet.contains(s.charAt(i))) {
				String tempWindow = findSubString(s.substring(i), t);
				if(tempWindow != null && tempWindow.length() < minWindowSize) {
					minWindowSize = tempWindow.length();
					minWindow = tempWindow;
				}
			}
		}
		
		return minWindow;
	}
	
	private String findSubString(String s, String t) {
		List<Character> chars = t.chars()
			    .mapToObj(e->(char)e).collect(Collectors.toList());
		
		for (int i = 0; i < s.length(); i++) {
			Character character = s.charAt(i);
			chars.remove(character);
			if(chars.isEmpty()) return s.substring(0, i + 1);
		}
		
		return null;
	}
	
	/*
	 * Sliding Window: 2 pointers, left pointer/right pointer
	 */
	
	public String minWindow(String s, String t) {
		if(s.length() == 0 || t.length() == 0) return "";
		
		Map<Character, Integer>  charMap = new HashMap<>(); 
		for(Character character : t.toCharArray()) {
			charMap.put(character, charMap.getOrDefault(character, 0) + 1);
		}
		
		int requiredUniqueChar = charMap.size();
		int currentUniqueChar = 0;
		Map<Character, Integer> currentCharMap = new HashMap<>();
		
		int left = 0, right = 0;
		int minWindowSize = -1;
		String minWindow = "";
		
		while (right < s.length()) {
			char currentRightChar = s.charAt(right);
			currentCharMap.put(currentRightChar, currentCharMap.getOrDefault(currentRightChar, 0) + 1);
			if(charMap.containsKey(currentRightChar) && currentCharMap.get(currentRightChar) == charMap.get(currentRightChar)) {
				currentUniqueChar++;
			}
			while(left <= right && requiredUniqueChar == currentUniqueChar) {
				char currentLeftChar = s.charAt(left);
				String tempWindow = s.substring(left, right + 1);
				if(tempWindow.length() < minWindowSize) {
					minWindowSize = tempWindow.length();
					minWindow = tempWindow;
				}
				currentCharMap.put(currentLeftChar, currentCharMap.get(currentLeftChar) - 1);
				if(charMap.containsKey(currentLeftChar) && currentCharMap.get(currentLeftChar) < charMap.get(currentLeftChar)) {
					currentUniqueChar--;
				}
				left++;
			}
			right++;
		}
		
		return minWindow;
	}
	
}
