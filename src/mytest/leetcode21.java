package mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 21. 合并两个有序链表
 * <P>
 *     将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * </P>
 */
//    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
//
//
//
//        示例 1：
//
//
//        输入：l1 = [1,2,4], l2 = [1,3,4]
//        输出：[1,1,2,3,4,4]
//        示例 2：
//
//        输入：l1 = [], l2 = []
//        输出：[]
//        示例 3：
//
//        输入：l1 = [], l2 = [0]
//        输出：[0]
//
//
//        提示：
//
//        两个链表的节点数目范围是 [0, 50]
//        -100 <= Node.val <= 100
//        l1 和 l2 均按 非递减顺序 排列

public class leetcode21 {

    public static void main(String[] args) {

        Lists lists = new Lists();
        ListNode1 l1 = new ListNode1(2, new ListNode1(1, new ListNode1(2, new ListNode1(4))));
        ListNode1 l2 = new ListNode1(1, new ListNode1(1, new ListNode1(3, new ListNode1(5))));
        ListNode1 nums = lists.mergeTwoLists(l1, l2);
        System.out.println("[" + nums.val + "," + nums.next.val + ","
                    + nums.next.next.val + "," + nums.next.next.next.val +
                "," + nums.next.next.next.next.val + "," + nums.next.next.next.next.next.val + "]");
    }
}

    // 解题思路
class Lists{

    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {
        List<Integer> list = new ArrayList<>();
        while (l1 != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(list);
        //
        ListNode1 vo = new ListNode1();
        ListNode1 nextVo = vo;
        for (int i = 0; i < list.size(); i++) {
            nextVo.next = new ListNode1(list.get(i));
            nextVo =  nextVo.next;
        }
        return vo.next;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {
    }

    ListNode1(int val) {

        this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}


