package datastructure;

public class ArrayBinaryTree{
    int[] datas;
    int length;
    
    public void levelInsert(int val) {
        int i;
        for(i=0; i<length; i++)
            if(datas[i]==Integer.MIN_VALUE) break;
        datas[i] = val;
    }
}