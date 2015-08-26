package leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by meet on 2015/8/26.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char current = s.charAt(i);

            if (map.containsKey(current)) {
                stack.push(current);
            } else if (map.containsValue(current)) {
                if (!stack.empty() && map.get(stack.peek()) == current)
                    stack.pop();
                else
                    return false;
            }
        }

        return stack.empty();
    }
}
