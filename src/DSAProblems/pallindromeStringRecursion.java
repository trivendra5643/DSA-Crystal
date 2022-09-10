package DSAProblems;

import java.util.Scanner;

public class pallindromeStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isStringPallindrome(str, 0, str.length() - 1));
    }

    static boolean isStringPallindrome(String str, int start, int end) {
        if(start >= end) return true;
        if(str.charAt(start) != str.charAt(end)) return false;
        return isStringPallindrome(str, start + 1, end - 1);
    }
}
