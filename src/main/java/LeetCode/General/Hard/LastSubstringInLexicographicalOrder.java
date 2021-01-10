package LeetCode.General.Hard;

public class LastSubstringInLexicographicalOrder {
	public String lastSubstring(String s) {
		if(s == null || s.length() <= 1 ) return s;
        int i = 0;
        int j = 1;
        int k = 0;
        while(j + k < s.length()) {
        	if(s.charAt(i + k) == s.charAt(j + k)) {
        		k++;
        		continue;
        	}
        	if (s.charAt(i + k) < s.charAt(j + k)) {
        		i = j;
        		j++;
        	} else {
        		j = j + k + 1;
        	}
        	k = 0;
        }
		
		return s.substring(i);
    }
}
