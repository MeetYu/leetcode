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

    /**
     * leetcode: Implement strStr()
     *
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * @param haystack the string
     * @param needle the string
     * @return the index of the first occurrence of needle in haystack,
     *          or -1 if needle is not part of haystack.
     */
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return -1;
        int hayLen = haystack.length();
        int neeLen = needle.length();
        if (hayLen < neeLen)
            return -1;
        int index = -1;
        for (int i = 0; i <= hayLen - neeLen; i++) {
            if (needle.equals(haystack.substring(i, i + neeLen))) {
                index = i;
                break;
            }
        }
        return index;
    }
}
