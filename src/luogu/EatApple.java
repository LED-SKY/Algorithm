package luogu;

import java.util.Scanner;

/**
 * @program: Algorithm
 * @description: 吃苹果
 * @author: 邓造坚
 * @create: 2021-06-13 16:40
 * <p>
 * <p>
 * 题目描述
 * 八尾勇喜欢吃苹果。她现在有 m(m≤100) 个苹果，吃完一个苹果需要花费 t(0≤t≤100) 分钟，
 * 吃完一个后立刻开始吃下一个。现在时间过去了 s(s\le 10000)s(s≤10000) 分钟，请问她还有几个完整的苹果？
 * <p>
 * 输入格式
 * 输入三个非负整数表示 m 、t 和 s。
 * <p>
 * 输出格式
 * 输出一个整数表示答案。
 * <p>
 * 如果你出现了 RE，不如检查一下被零除？
 **/
public class EatApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        float t, s;
        int endApple;
        m = sc.nextInt();
        t = sc.nextInt();
        s = sc.nextInt();
        if (t < 0 || m < 0 || s < 0) {
            return;
        } else if (t == 0) {
            System.out.println(0);
        }else {
            float eatApple = s / t;
            endApple = ((int) (m - eatApple));
            if (endApple < 0){
                System.out.println(0);
                return;
            }
            System.out.println(endApple);
        }

    }

}
