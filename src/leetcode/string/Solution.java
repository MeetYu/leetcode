package leetcode.string;

/**
 * Created by meet on 2015/8/20.
 */
public class Solution {
    /**
     * leetcode: Valid Palindrome
     *
     * Given a string, determine if it is a palindrome, considering only
     * alphanumeric characters and ignoring cases.
     *
     * For example,
     * "A man, a plan, a canal: Panama" is a palindrome.
     * "race a car" is not a palindrome.
     *
     * @param s
     * @return true if the argument s is palindrome, otherwise false.
     */
    public boolean isPalindrome(String s) {
        if (s == null)
            return false;
        if (s.length() <= 1)
            return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i))
                return false;
        }
        return true;
    }
}
