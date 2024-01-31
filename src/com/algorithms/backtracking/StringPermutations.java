package com.algorithms.backtracking;

import java.util.HashSet;

public class StringPermutations {

    public static HashSet<String> permute(String str) {
        var permutations = new HashSet<String>();
        permute(str, "", permutations);
        return permutations;
    }

    private static void permute(String str, String candidate, HashSet<String> permutations) {
        if (str.isEmpty()) {
            permutations.add(candidate);
            return;
        }
        String newStr;
        for (int i = 0; i < str.length(); i++) {
            newStr = str.substring(0, i) + str.substring(i + 1);
            permute(newStr, candidate + str.charAt(i), permutations);
        }
    }

    public static void main(String[] args) {
        String s = "GOOD";
        System.out.println(permute(s));
    }

}
