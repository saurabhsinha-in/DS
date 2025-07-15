/**
Longest Common Prefix of Strings
Difficulty: EasyAccuracy: 29.52%Submissions: 306K+Points: 2Average Time: 15m
Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.
 */


package quiz.puzzle.string;

import java.util.Arrays;

public class LongestCommonPrefixStrings {

    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

            StringBuilder sb = new StringBuilder();
        if(arr.length>0) {
            String first = arr[0];
            String last = arr[arr.length - 1];
            int size = last.length();
            if (first.length() < last.length()) {
                size = first.length();
            }

            int k = 0;
            char[] f = first.toCharArray();
            char[] l = last.toCharArray();
            while (k < size) {
                if (f[k] != l[k]) {
                    break;
                } else {
                    sb.append(f[k]);
                }
                k++;
            }
        }
        return sb.toString();
    }
}
