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

    /**
     * leetcode: Remove Duplicates from Sorted Array II.
     * @param nums the array to be remove its duplicates.
     * @return the number of nums after remove its duplicates, or -1 if nums is null.
     */
    public int removeDuplicatesII(int[] nums) {
        if (nums == null)
            return -1;
        if (nums.length <= 2)
            return nums.length;

        int head = 1;
        int rep = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                rep++;
            else
                rep = 1;
            nums[head] = nums[i];
            if (rep <= 2)
                head++;
        }

        return head;
    }

    /**
     * leetcode: Remove Element.
     * @param nums the array to be remove its duplicates.
     * @return the number of nums after remove its duplicates, or -1 if nums is null.
     */
    public static int removeElement(int[] nums, int val) {
        if (nums == null)
            return -1;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index++;
    }
}
