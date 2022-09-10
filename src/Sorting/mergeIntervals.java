package Sorting;

import java.util.*;

public class mergeIntervals {
    public static void main(String[] args) {
//        int[][] intervals = {{7, 9}, {6, 10}, {4, 5}, {1, 3}, {2, 4}};
        int[][] intervals = {{1, 3}, {2, 4}, {4, 5}, {6, 10}, {7, 9}};
//        int[][] intervals1 = new int[intervals.length][2];
        intervals = merge(intervals);
        for(int[] arr: intervals) System.out.print(Arrays.toString(arr) + " ");
    }

    public static int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int[] nums: intervals) {
            ArrayList<Integer> interval = new ArrayList<>();
            for(int n: nums) interval.add(n);
            list.add(interval);
        }
        Collections.sort(list, new sortByStartingPoint());
        int i = 0;
        while(i < list.size() - 1) {
            if(list.get(i).get(1) >= list.get(i + 1).get(0)) {
                ArrayList<Integer> newInterval = new ArrayList<>();
                newInterval.add(list.get(i).get(0));
                newInterval.add(Math.max(list.get(i).get(1), list.get(i + 1).get(1)));
                list.add(i, newInterval);
                list.remove(i + 1);
                list.remove(i + 1);
            }else i++;
        }
        int[][] res = new int[list.size()][2];
        for(int ind = 0; ind < res.length; ind++) {
            for(int j = 0; j < 2; j++) {
                res[ind][j] = list.get(ind).get(j);
            }
        }
        return res;
    }

}

class sortByStartingPoint implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        return a.get(0) - b.get(0);
    }
}
