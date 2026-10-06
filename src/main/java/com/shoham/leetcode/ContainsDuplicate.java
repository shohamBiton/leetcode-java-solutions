package com.shoham.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //    [1,2,3,4,1]
//    time complexity O(n)
//    space complexity o(n)
    public static boolean containsDuplicate(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
