package leetcode.binaryTree;

import java.util.*;

/**
 * Created by meet on 2015/8/14.
 */
public class Solution {

    /**
     * leetcode: Binary Tree Preorder Traversal
     *
     * Given a binary tree, return the preorder traversal of its nodes' values.
     *
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
     * leetcode: Binary Tree Inorder Traversal
     *
     * Given a binary tree, return the inorder traversal of its nodes' values.
     *
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
     * leetcode: Binary Tree Postorder Traversal
     *
     * Given a binary tree, return the postorder traversal of its nodes' values.
     *
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

    /**
     * leetcode: Binary Tree Level Order Traversal
     *
     * Given a binary tree, return the level order traversal of its nodes'
     * values. (ie, from left to right, level by level).
     *
     * @param root the argument to be levelorderly traversed.
     * @return a list containing the levelorder traversal of its nodes' values.
     */
    public static List<List<Integer>> levelorderTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<Node>();
        Node flag = new Node(0);
        queue.add(root);
        //添加标志位来区分每一层结束
        queue.add(flag);
        List<Integer> level = new ArrayList<>();
        while (queue.size() > 1) {
            Node e = queue.poll();
            if (e != flag) {
                level.add(e.value);
                if (e.left != null) {
                    queue.add(e.left);
                }
                if (e.right != null) {
                    queue.add(e.right);
                }
            } else {
                result.add(level);
                level = new ArrayList<Integer>();
                queue.add(flag);
            }
        }

        result.add(level);
        return result;
    }

    /**
     * leetcode: Binary Tree Level Order Traversal II
     *
     * Given a binary tree, return the bottom-up level order traversal of its
     * nodes' values. (ie, from left to right, level by level from leaf to root).
     *
     * @param root the argument to be levelorderly traversed.
     * @return a list containing the levelorder traversal of its nodes' values.
     */
    public List<List<Integer>> levelOrderBottom(Node root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<Node>();
        Node flag = new Node(0);
        queue.add(root);
        //添加标志位来区分每一层结束
        queue.add(flag);
        List<Integer> level = new ArrayList<>();
        while (queue.size() > 1) {
            Node e = queue.poll();
            if (e != flag) {
                level.add(e.value);
                if (e.left != null) {
                    queue.add(e.left);
                }
                if (e.right != null) {
                    queue.add(e.right);
                }
            } else {
                result.addFirst(level);
                level = new ArrayList<Integer>();
                queue.add(flag);
            }
        }

        result.addFirst(level);
        return result;
    }
}
