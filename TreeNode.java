import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> {
    T value;
    TreeNode<T> left, right;

    TreeNode(T val) {
        this.value = val;
    }

    TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
        this.value = val;
        this.left = left;
        this.right = right;
    }

    public static <T> TreeNode<T> construct(T[] arr) {
        if (arr.length == 0)
            return null;

        TreeNode<T> result = null;
        Queue<TreeNode<T>> q = new LinkedList<>();
        q.add(result);

        int index = 0;
        TreeNode<T> temp;
        while (index < arr.length) {
            temp = q.poll();
            if (arr[index] == null){
                continue;
            }
            if(index<arr.length)
                temp.left = new TreeNode<T>(arr[index++]);
            if(index<arr.length)
                temp.right = new TreeNode<T>(arr[index++]);
        }
        return result;
    }

    public void inPrint(){
        if(this.value==null) return;
        this.left.inPrint();
        System.out.print(this.value+"->");
        this.right.inPrint();
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeNode.construct(new Integer[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        root.inPrint();
    }
}
