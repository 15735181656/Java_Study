package example;

import example.Demo.UnionFind;
import example.Tree.CreateTree;
import example.Tree.Traversal;
import example.Tree.TreeNode;

import java.util.*;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        String s = "a";
//        String res = longestPalindrome(s);
//        System.out.println(res);
    }
    //输入: [1,2,3,null,5,null,4]
    //输出: [1, 3, 4]
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        TreeNode node = root;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(node);
        while (!deque.isEmpty()){
            int size = deque.size();
            for (int i = 0; i < size; i ++){
                node = deque.poll();
                if (i == 0)
                    res.add(node.val);
                if (node.right != null){
                    deque.add(node.right);
                }
                if (node.left != null) {
                    deque.add(node.left);
                }
            }
        }
        return res;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}