package leetcode.array;

/**
 * Created by meet on 2015/8/16.
 */
public class Solution {

    /**
     * leetcode: Remove Duplicates from Sorted Array.
     * @param nums the array to be remove its duplicates.
     * @return the number of nums after remove its duplicates, or -1 if nums is null.
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null)
            return -1;
        if (nums.length == 0)
            return 0;

        int head = 0;
        int tail = 0;

        while (tail < nums.length - 1) {
            if (nums[head] != nums[++tail])
                nums[++head] = nums[tail];
        }

        return ++head;
    }
}
