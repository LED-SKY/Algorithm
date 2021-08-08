package luogu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @program: Algorithm
 * @description: 计算三角形面积
 * @author: 邓造坚
 * @create: 2021-06-11 22:00
 * <p>
 * <p>
 * 展开
 * 题目描述
 * 一个三角形的三边长分别是 aa、bb、cc，那么它的面积为 \sqrt{p(p-a)(p-b)(p-c)}
 * p(p−a)(p−b)(p−c)
 * ​
 * ，其中 p=\frac{1}{2}(a+b+c)p=
 * 2
 * 1
 * ​
 * (a+b+c)。输入这三个数字，计算三角形的面积，四舍五入精确到 1 位小数。
 **/
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        double p = 0.5 * (a + b + c);

        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(area));
    }

}
