package DynamicProgramming;

import java.util.*;

class Pairs {
    int a, b;
    Pairs(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class myComp implements Comparator<Pairs> {
    public int compare(Pairs p1, Pairs p2) {
        if(p1.a == p2.a) return p1.b - p2.b;
        return p1.a - p2.a;
    }
}

public class LongestPairChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pairs[] my_pairs= new Pairs[n];
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            my_pairs[i] = new Pairs(a, b);
        }
        Arrays.sort(my_pairs, new myComp());
        System.out.println(helperFun(my_pairs));
    }

    static int helperFun(Pairs[] my_pairs) {
        int[] arr = new int[my_pairs.length];
        arr[0] = 1;
        for(int i = 1; i < my_pairs.length; i++) {
            arr[i] = 1;
            for(int j = i - 1; j >= 0; j--) {
                if(my_pairs[j].b < my_pairs[i].a) arr[i] = Math.max(arr[i], 1 + arr[j]);
            }
        }
        int res = 0;
        for(int i = 0; i < my_pairs.length; i++) res = Math.max(res, arr[i]);
        return res;
    }

}
