package DSAProblems;

import java.util.Scanner;
import java.lang.Math;

public class cutTheRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(totalCutsInRope(n, a, b, c));
    }

    static int totalCutsInRope(int n, int a, int b, int c) {
        if(n < 0) return -1;
        if(n == 0) return 0;
        int res = Math.max(Math.max(totalCutsInRope(n - a, a, b, c),
                totalCutsInRope(n - b, a, b, c)), totalCutsInRope(n - c, a, b, c));
        if(res == -1) return -1;
        return 1 + res;
    }
}
