package leeCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Algorithm
 * @description:
 * @author: 邓造坚
 * @create: 2021-08-04 16:24
 * 
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * 
 * 
 * 
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 **/
public class MaxNumber {

    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<>();
        //转换为字符串
        for (int s : nums) {
            list.add(s + "");
        }
        
        //根据我们重写的compare逆序排序
        list.sort((o1,o2) ->{
            String str1 = o1+o2;
            String str2 = o2+o1;
            System.out.println(o1 + " " + o2);
            return str2.compareTo(str1);
        });

        StringBuffer stringBuffer = new StringBuffer();
        for (String s : list) {
            stringBuffer.append(s);
        }
        
        //判断00的情况
        if (stringBuffer.charAt(0) == '0'){
            return "0";
        }
        
        return stringBuffer.toString();


    }
    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();
        System.out.println(maxNumber.largestNumber(new int[]{3, 30, 34, 5, 9}));
        System.out.println(maxNumber.largestNumber(new int[]{1,2,3}));
    }
}
