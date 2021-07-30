package mytest;

/***
 * 35. 搜索插入位置
 * <P>
 *  给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回
 *  这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *  </P>
 */
//
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//        你可以假设数组中无重复元素。
//
//        示例 1:
//
//        输入: [1,3,5,6], 5
//        输出: 2
//        示例 2:
//
//        输入: [1,3,5,6], 2
//        输出: 1
//        示例 3:
//
//        输入: [1,3,5,6], 7
//        输出: 4
//        示例 4:
//
//        输入: [1,3,5,6], 0
//        输出: 0

public class leetcode35 {

    public static void main(String[] args) {

        Insert insert = new Insert();
        System.out.println(insert.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}

class  Insert{
    public int searchInsert(int[] nums, int target) {
        int mIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                return i;
            }else{
                if(nums[i] < target){
                    mIndex = i + 1;
                }
            }
        }
        return mIndex;
    }
}

