package leeCode;

import java.util.ArrayList;

/**
 * @program: Algorithm
 * @description:
 * @author: 邓造坚
 * @create: 2021-07-24 14:06
 * 
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 *  输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 **/
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i +1; j < nums.length; j++) {
                
                int sum = 0;
                sum = nums[i] + nums[j];
                if (sum == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }

        System.out.println(list);
    }
}
