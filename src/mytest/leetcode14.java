package mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * 14. 最长公共前缀
 */
/*
 * 题目信息
 * <P>
 *编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 * 提示：
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成

 */
public class leetcode14 {

    public static void main(String[] args) {

        prefix prefix = new prefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(prefix.longestCommonPrefix(strs));
    }
}
class prefix{
    public String longestCommonPrefix(String[] strs) {
        // 判空
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 获取所有可能的最长前缀
        List<String> strsList = new ArrayList<>();
        for (int i = 0; i < strs[0].length(); i++) {
            strsList.add(strs[0].substring(0, i +1));
        }

        // 开始检查
        String resVal = "";
        // 遍历可能为最长前缀的数据
        for (int i = 0; i < strsList.size(); i++) {
            String val1 = strsList.get(i);
            // 遍历入参
            boolean isVal = true;
            for (int j = 0; j < strs.length; j++) {
                // 判断当前字符串的长度
                if (strs[j].length() < val1.length()) {
                    isVal = false;
                    break;
                }
                // 判断字符是否相等
                String val2 = strs[j].substring(0, val1.length());
                if (!val2.equals(val1)) {
                    isVal = false;
                }
            }
            // 判断结果
            if (isVal) {
                resVal = val1;
            } else {
                break;
            }
        }
        return resVal;
    }
}



