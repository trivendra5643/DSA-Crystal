package Strings;

import java.util.*;
public class FunnyString {
    public static void main(String[] args) {
//        String s = "acxz";
//        System.out.println(fun(s));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)  list.add(sc.nextInt());
        Collections.sort(list, Collections.reverseOrder());
        int res = 0;
        while(list.size() >= 3) {
            res += (list.get(0) + list.get(1));
            list.remove(0); list.remove(0); list.remove(0);
        }
        while(list.size() > 0) {
            res += list.get(0);
            list.remove(0);
        }
        System.out.println(res);
    }

//    static String fun(String s) {
//        char[] chars = s.toCharArray();
//        int start = 0, end = chars.length - 1;
//        while(start < end) {
//            char temp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = temp;
//            start++; end--;
//        }
//        String str = new String(chars);
//        int[] arr1 = new int[s.length() - 1];
//        int[] arr2 = new int[s.length() - 1];
//        for(int i = 0; i < arr1.length; i++) {
//            arr1[i] = Math.abs((int)s.charAt(i + 1) - (int)s.charAt(i));
//        }
//        for(int i = 0; i < arr2.length; i++) {
//            arr2[i] = Math.abs((int)str.charAt(i + 1) - (int)str.charAt(i));
//        }
//        if(Arrays.equals(arr1, arr2)) return "Funny";
//        return "Not Funny";
//    }

}
