package luogu;

import java.util.Scanner;

/**
 * @program: Algorithm
 * @description: 数字翻转
 * @author: 邓造坚
 * @create: 2021-06-10 15:27
 * <p>
 * 题目描述
 * 输入一个不小于 100 且小于 1000，同时包括小数点后一位的一个浮点数，例如 123.4 ，要求把这个数字翻转过来，变成 4.321并输出。
 * <p>
 * 输入格式
 * 一行一个浮点数
 * <p>
 * 输出格式
 * 一行一个浮点数
 **/
public class DigitalFlip {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s ;
        float a;
        while (true){
            s = sc.nextLine();

            a=Float.parseFloat(s);
            if (a > 100 && a < 1000){
                for (int i = s.length()-1; i >=0; i--) {
                    System.out.print(s.charAt(i));
                }
            }else {
                System.out.println("你输入的数不是一个一个不小于 100 且小于 1000");
            }
        }
        }


}
