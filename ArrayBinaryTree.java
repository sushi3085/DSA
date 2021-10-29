public class ArrayBinaryTree{
    int[] datas;
    int length;
    
    public void levelInsert(int val) {
        for(int i=0; i<length; i++)
            if(datas[i]==Integer.MIN_VALUE) break;
        datas[i] = val;
    }
}