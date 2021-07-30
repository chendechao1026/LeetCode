package mytest;

import java.util.Arrays;
import java.util.HashMap;

/*
    给定一个整数数组 nums和一个整数目标值 target，
    请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    你可以按任意顺序返回答案。

    示例 1：
    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

    示例 2：
    输入：nums = [3,2,4], target = 6
    输出：[1,2]

    示例 3：
    输入：nums = [3,3], target = 6
    输出：[0,1]

 */
public class LeetCode1 {
    public static void main(String[] args) {
        Method method = new Method();
        int[] data1 = method.twoSum(new int[]{2, 7, 11, 15},9);
        System.out.println(Arrays.toString(data1));

        int[] data2 = method.twoSum(new int[]{3,2,4},6);
        System.out.println(Arrays.toString(data2));

        int[] data3 = method.twoSum(new int[]{3,3},6);
        System.out.println(Arrays.toString(data3));
    }
}

class Method {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                res[1] = i;
                res[0] = map.get(temp);
            }
            map.put(nums[i], i);
        }
        return res;
    }
}