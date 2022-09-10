package DSAProblems;

import java.util.Scanner;

public class Print1toNRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        print1toN(n);
        print1toNV2(n, 1);
    }

    static void print1toN(int n) {
        if(n <= 0) return;
        if(n > 0) print1toN(n - 1);
        System.out.print(n + " ");
    }

//    tail recursive version
    static void print1toNV2(int n, int a) {
        if(n <= 0) return;
        System.out.print(a + " ");
        print1toNV2(n - 1, a + 1);
    }

}
