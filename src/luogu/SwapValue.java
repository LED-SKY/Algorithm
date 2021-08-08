package luogu;

/**
 * @program: Algorithm
 * @description: 使用异或的方式来实现交换两个变量的值，不需要使用中间变量
 * @author: 邓造坚
 * @create: 2021-07-10 14:21
 **/
public class SwapValue {
    public static void main(String[] args) {
        int first = 2;
        int two = 6;
        //异或操作
        first = first^two; // 第一个数和第二个数异或后得到的值，相当于一个中间变量
        two = first^two;    //  将第二个数用中间变量异或后还原为第一个数
        first = two^first;  //  将已经变成开始时候的第一个数的值通过中间变量还原为原始的第二个的值。
        System.out.println(first);
        System.out.println(two);
        
    }
}
