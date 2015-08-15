package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by meet on 2015/8/14.
 */
public class Solution {

    /**
     * 二叉树的先序遍历
     * @param tree the argument to be preorderly traversed.
     * @return a list containing the result in order.
     */
    public static List<Integer> preorderTraversal(Node tree) {
        List<Integer> result = new ArrayList<Integer>();

        if (tree == null) {
            return result;
        }

        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || tree != null) {
            if (tree != null) {
                result.add(tree.value);
                stack.push(tree);
                tree = tree.left;
            } else {
                Node e = stack.pop();
                tree = e.right;
            }
        }

        return result;
    }
}
