package DynamicProgramming;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String str = "ababbbabbababa";
        System.out.println(helper(str, 0));
    }

    static int helper(String str, int ind) {
        if(reverse(str).equals(str)) return 0;
        if(ind == str.length() - 1) return 0;
        if(str.length() == 1) return 0;
        int res = Integer.MAX_VALUE;
        for(int i = ind + 1; i < str.length(); i++) {
            String sub = str.substring(ind, i);
            if(reverse(sub).equals(sub)) {
                res = Math.min(res, 1 + helper(str, ind + 1));
            }
        }
        return res;
    }


    static String reverse(String s) {
        if(s.length() == 1) return s;
        char[] chars = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while(start < end) {
            char c = chars[start];
            chars[start++] = chars[end];
            chars[end--] = c;
        }
        return String.valueOf(chars);
    }

}
