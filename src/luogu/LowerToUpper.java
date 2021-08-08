package luogu;

import java.util.Scanner;

/**
 * @program: Algorithm
 * @description: 小写转大写
 * @author: 邓造坚
 * @create: 2021-06-10 14:23
 *
 *
 * 题目描述
 * 输入一个小写字母，输出其对应的大写字母。例如输入 q[回车] 时，会输出 Q。
 *
 *
 **/
public class LowerToUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lowerString  = sc.nextLine();
        System.out.println(lowerString.toUpperCase());
    }
}
