package BST;


import java.util.TreeSet;

public class leftCeilArray {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4};
        int[] res = new int[arr.length];
        TreeSet<Integer> t = new TreeSet<>();
        t.add(arr[0]);
        res[0] = -1;
        for(int i = 1; i < arr.length; i++) {
            if(t.ceiling(arr[i]) == null) {
                res[i] = -1;
            }else res[i] = t.ceiling(arr[i]);
           t.add(arr[i]);
        }
        for(int a: res) System.out.print(a + " ");
    }
}
