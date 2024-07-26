package easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = {"dog","racecar","car"};
        longestCommonPrefix(str);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        for(int i = 0; i < first.length(); ++i) {
            if(first.charAt(i) == last.charAt(i)) {
                prefix += first.charAt(i);
            } else {
                break;
            }
        }

        if(prefix.length() != 0) {
            return prefix;
        } else {
            return "";
        }

    }
}
