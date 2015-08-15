package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by meet on 2015/8/14.
 */
public class Solution {

    /**
     * Preorder traversal of a binary tree.
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

    /**
     * Inorder traversal of a binary tree.
     * @param root the argument to be inorderly traversed.
     * @return a list containing the inorder traversal of its nodes' values.
     */
    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new ArrayList<Integer>();

        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                Node e = stack.pop();
                result.add(e.value);
                root = e.right;
            }
        }

        return result;
    }
}
