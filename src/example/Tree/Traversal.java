package example.Tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Traversal {
    //递归前序遍历
    public static void preOrderTraversal(TreeNode root){
        if (root == null)
            return;
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //非递归前序遍历
    public static void preOrderTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                System.out.println(node.val);
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
    }
    //递归中序
    public static void inOrderTraversal(TreeNode root){
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.println(root.val);
        inOrderTraversal(root.right);
    }
    //非递归中序
    public static void inOrderTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            while (node != null){
                stack.add(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.println(node.val);
            node = node.right;
        }
    }
    //递归后序遍历
    public static void afterOrderTraversal(TreeNode root){
        if (root == null)
            return;
        afterOrderTraversal(root.left);
        afterOrderTraversal(root.right);
        System.out.println(root.val);
    }
    //非递归后续遍历
    public static void afterOrderTraversal2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode lastNode = node;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                stack.add(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right == null || node.right == lastNode){
                System.out.println(node.val);
                lastNode = node;
                stack.pop();
                node = null;
            }else {
                node = node.right;
            }
        }
    }
    //层次遍历
    public static void levelOrderTraversal(TreeNode root){
        if (root == null)
            return;
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode node = root;
        deque.add(node);
        while (!deque.isEmpty()){
            node = deque.poll();
            System.out.println(node.val);
            if (node.left != null)
                deque.add(node.left);
            if (node.right != null)
                deque.add(node.right);
        }
    }
    //记录层次遍历
    public static List<List<TreeNode>> levelOrderTraversal2(TreeNode root){
        if (root == null)
            return new ArrayList<>();
        List<List<TreeNode>> res = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode node = root;
        deque.add(node);
        while (!deque.isEmpty()){
            List<TreeNode> level = new ArrayList<>();
            int len = deque.size();
            for (int i = 0; i < len; i++){
                node = deque.poll();
                level.add(node);
                if (node.left != null)
                    deque.add(node.left);
                if (node.right != null)
                    deque.add(node.right);
            }
            System.out.println(Arrays.toString(level.toArray()));
            res.add(level);
        }
        return res;
    }
    //树的深度
    public static int treeDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
