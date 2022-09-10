package DSAProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class josephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= num; i++) list.add(i);
        System.out.println(josephusRecursion(list, 0, k));
    }

//  using auxiliary space (list) and starting index 1
    static int josephusRecursion(ArrayList<Integer> list, int start, int k) {
        if(list.size() == 1) return list.get(0);
        start = (start + k - 1) % list.size();
        list.remove(start);
        return josephusRecursion(list, start, k);
    }

//    without using auxiliay space and starting index 0
    static int josephusRecursionV2(int num, int k) {
        if(num == 1) return 0;
        return (josephusRecursionV2(num - 1, k) + k) % num;
    }

//    without auxiliary space and starting index 1
    static int josephusRecursionV21(int num, int k) {
        if(num == 1) return 1;
        return ((josephusRecursionV21(num - 1, k) + (k - 1)) % num) + 1;
    }

    static int josephusRecursionV2Helper(int num, int k) {
        return josephusRecursionV2(num, k) + 1;
    }




}
