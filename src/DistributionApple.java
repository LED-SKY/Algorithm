import java.util.Scanner;

/**
 * @program: Algorithm
 * @description: 分发苹果
 * @author: 邓造坚
 * @create: 2021-06-10 14:13
 * <p>
 * 题目描述
 * 现在需要采购一些苹果，每名同学都可以分到固定数量的苹果，并且已经知道了同学的数量，请问需要采购多少个苹果？
 * <p>
 * 输入格式
 * 输入两个不超过 10^9
 * 正整数，分别表示每人分到的数量和同学的人数。
 * <p>
 * 输出格式
 * 一个整数，表示答案。保证输入和答案都在int范围内的非负整数。
 **/
public class DistributionApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int appleNumber = 0;
        int studentNumber = 0;
        appleNumber = sc.nextInt();
        studentNumber = sc.nextInt();
        System.out.println((appleNumber * studentNumber));
    }
}
