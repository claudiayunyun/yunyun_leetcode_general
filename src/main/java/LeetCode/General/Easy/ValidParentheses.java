package LeetCode.General.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
        /*
         * Use stack to implement (LIFO)
         * Use a map tp store the Parentheses pair
         */
        Map<Character, Character> parenthese = new HashMap<>();
        parenthese.put('(', ')');
        parenthese.put('{', '}');
        parenthese.put('[', ']');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(parenthese.containsKey(s.charAt(i))) {
                stack.add(parenthese.get(s.charAt(i)));
            } else {
                if(stack.pop() != s.charAt(i)) return false;
            }
        }
        return true;
    }
}
