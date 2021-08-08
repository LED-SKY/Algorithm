package luogu;

import java.util.Scanner;

/**
 * @Author 邓造坚
 * @Date 2021/6/9 上午 8:56
 * @Description 小玉买文具
 * <p>
 * 题目描述
 * 班主任给小玉一个任务，到文具店里买尽量多的签字笔。已知一只签字笔的价格是 1 元 9 角，而班主任给小玉的钱是 a 元 b 角，小玉想知道，她最多能买多少只签字笔呢。
 * <p>
 * 输入格式
 * 输入只有一行两个整数，分别表示 aa 和 bb。
 * <p>
 * 输出格式
 * 输出一行一个整数，表示小玉最多能买多少只签字笔。
 */
public class BuyStationery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //总价
        float totalPrice =0;
        if (a < 0 || a > 10000) {
            System.out.println("输入的a不合法");
        } else {
            totalPrice += a;
        }
        if (b < 0 || b > 9) {
            System.out.println("输入的b不合法");
        } else {
            totalPrice += (b * 0.1);
        }
    //输出所得的文具数
        System.out.println((int)(totalPrice / 1.9));
    }
}
