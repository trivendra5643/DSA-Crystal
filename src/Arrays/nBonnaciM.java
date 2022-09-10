package Arrays;

import java.util.Scanner;

public class nBonnaciM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        printBonacci(m, n);
    }
    static void printBonacci(int m, int n) {
        int[] arr = new int[m];
        for(int i = 0; i < n - 1; i++) arr[i] = 0;
        arr[n - 1] = 1;
        int sum = 1;
        for(int i = n; i < m; i++) {
            arr[i] = sum;
            sum += (arr[i] - arr[i - n]);
        }
        for(int num: arr) System.out.print(num + " ");
    }
}
