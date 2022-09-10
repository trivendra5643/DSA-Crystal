package DSAProblems;

import java.util.Scanner;

public class subsetsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printSubsets(str, 0, "");
    }

    static void printSubsets(String s, int index, String ans) {
        if(index == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        printSubsets(s, index + 1, ans);
        printSubsets(s, index + 1, ans + s.charAt(index));
    }
}
