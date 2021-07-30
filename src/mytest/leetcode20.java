package mytest;

import java.util.Stack;

/***
 * 20、有效的括号
 */
// 题目信息

//   给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
//
//   有效字符串需满足：
//
//   左括号必须用相同类型的右括号闭合。
//   左括号必须以正确的顺序闭合。
//
//
//   示例 1：
//
//   输入：s = "()"
//   输出：true
//   示例 2：
//
//   输入：s = "()[]{}"
//   输出：true
//   示例 3：
//
//   输入：s = "(]"
//   输出：false
//   示例 4：
//
//   输入：s = "([)]"
//   输出：false
//   示例 5：
//
//   输入：s = "{[]}"
//   输出：true
//
//
//   提示：
//
//   1 <= s.length <= 104
//   s 仅由括号 '()[]{}' 组成

public class leetcode20 {

    public static void main(String[] args) {

        valid valid1 = new valid();
        String strs = "(([]){})";
        System.out.println(valid1.isValid(strs));
    }
}

    // 解题思路
    // 遍历, 肯定先出现左括号
    // 1、在stack栈中保存左括号对应的右括号
    // 2、获取到右括号是判断stack栈是否存在(第一步找到左括号会保存右括号到stack)
    // 3、如果存在弹出，进行遍历重复 1,2 步骤, 找不到肯定为括号输入错误
    // 4、如果最后stack内仍有数据，表示没有左括号对应的右括号(isEmpty判断)

class valid{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || c != stack.pop()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}


