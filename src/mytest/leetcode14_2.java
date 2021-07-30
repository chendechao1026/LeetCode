package mytest;

import java.util.ArrayList;
import java.util.List;

public class leetcode14_2 {

    public static void main(String[] args) {

        prefix2 prefix = new prefix2();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(prefix.longestCommonPrefix(strs));
    }
}
class prefix2{
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        List<String> strsList = new ArrayList<>();
        String s1 = strs[0] + "";
        for (int i = s1.length(); i > 0; i--) {
            strsList.add(s1.substring(0, i));
        }
        for (String s : strsList) {
            boolean res = true;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < s.length()) {
                    res = false;
                    break;
                } else {
                    String sv = strs[i].substring(0, s.length());
                    if (sv.indexOf(s) == -1) {
                        res = false;
                        break;
                    }
                }
            }
            if (res) {
                return s;
            }
        }
        return "";
    }
}