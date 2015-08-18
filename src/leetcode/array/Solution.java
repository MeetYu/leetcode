package leetcode.array;

/**
 * Created by meet on 2015/8/16.
 */
public class Solution {

    /**
     * leetcode: Remove Duplicates from Sorted Array.
     *
     * Given a sorted array, remove the duplicates in place such that each element
     * appear only once and return the new length. Do not allocate extra space for
     * another array, you must do this in place with constant memory.
     *
     * For example,
     * Given input array nums = [1,1,2],
     * Your function should return length = 2, with the first two elements of nums
     * being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
     *
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
     *
     * Follow up for "Remove Duplicates":
     * What if duplicates are allowed at most twice?
     *
     * For example,
     * Given sorted array nums = [1,1,1,2,2,3],
     * Your function should return length = 5, with the first five elements of nums
     * being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
     *
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
     *
     * Given an array and a value, remove all instances of that value in place and
     * return the new length. The order of elements can be changed. It doesn't
     * matter what you leave beyond the new length.
     *
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
