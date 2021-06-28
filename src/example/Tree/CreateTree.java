package example.Tree;

public class CreateTree {
    public static TreeNode createTree(int[] array, int index){
        TreeNode node = null;
        if (index < array.length){
            if (array[index] != 0){
                node = new TreeNode(array[index]);
//                System.out.println(array[index]);
                node.left = createTree(array, index * 2 + 1);
                node.right = createTree(array, index * 2 + 2);
            }
        }
        return node;
    }
}
