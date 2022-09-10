package DSAProblems;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findSum(num, 0));
    }
//  tail recursive
    static int findSum(int num, int sum) {
        if(num <= 0) return sum;
        return findSum(num / 10, sum + num % 10);
    }

}
