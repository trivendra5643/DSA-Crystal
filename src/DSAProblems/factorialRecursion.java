package DSAProblems;

import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n,1 ));
    }

    static int fact(int n) {
        if(n == 0) return 1;
        return n * fact(n - 1);
    }

//    tail recursive version
    static int factorial(int n, int a) {
        if(n <= 0) return a;
        return factorial(n - 1, n * a);
    }

}
