package leetcode.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
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

    /**
     * Postorder traversal of a binary tree.
     * @param root the argument to be postorderly traversed.
     * @return a list containing the postorder traversal of its nodes' values.
     */
    public static List<Integer> postorderTraversal(Node root) {
        LinkedList<Integer> result = new LinkedList<Integer>();

        if (root == null) {
            return result;
        }

        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while (stack.size() > 0) {
            Node e = stack.pop();
            //采用LinkedList，可把最先遍历到的节点添加到列表末端，从而实现后序遍历。
            result.addFirst(e.value);
            if (e.left != null) {
                stack.push(e.left);
            }
            if (e.right != null) {
                stack.push(e.right);
            }
        }

        return result;
    }
}
