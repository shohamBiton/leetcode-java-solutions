package com.shoham.leetcode;

public class ValidAnagram {
    public static boolean isValidAnagram(String a, String b) {
        if (a.length() == b.length()) {
            int[] arr = new int[26];
            for (int i = 0; i < a.length(); i++) {
                arr[(int) a.charAt(i) - 'a']++;
                arr[(int) b.charAt(i) - 'a']--;
            }
            for (int n : arr) {
                if (n != 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
//time complexity o(n)
//space complexity o(1)

    }

}
