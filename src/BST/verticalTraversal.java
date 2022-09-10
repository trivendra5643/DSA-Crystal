//package BST;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.TreeMap;
//import java.util.TreeSet;
//
//public class verticalTraversal {
//
//
//    TreeMap<Integer, TreeMap<Integer, Integer>> map = new TreeMap<>();
//    public static void main(String[] args) {
//        TreeSet<Integer> t = new TreeSet<>();
//        t.add(5);
//        t.add(8262);
//        t.add(411);
//        ArrayList<ArrayList<Integer>> ans = verticalOrderTraversal((TreeNode) t);
//        System.out.println(ans);
//    }
//
//    public static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
//        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        if(A == null) return res;
//        helper(A, 0, 0);
//        for(Map.Entry<Integer, TreeMap<Integer, Integer>> e: map.entrySet()) {
//            ArrayList<Integer> cols = new ArrayList<>();
//            for(Map.Entry<Integer, Integer> ee: e.getValue().entrySet()) {
//                cols.add(ee.getValue());
//            }
//        }
//        return res;
//    }
//
//
//    void static helper(TreeNode root, int col, int row) {
//        if(root == null) return;
//        helper(root.left, col - 1, row + 1);
//        if(!map.containsKey(col)) map.put(col, new TreeMap<Integer, Integer>());
//        map.get(col).put(row,root.val);
//        helper(root.right, col + 1, row + 1);
//    }
//
//
//
//
//}
//
//
//
//
