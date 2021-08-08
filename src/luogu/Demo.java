package luogu;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Author 邓造坚
 * @Date 2021/6/8 下午 5:46
 * @Description Junit测试
 * @Test 注解是和class类是属于同一级别的，不能在@Test中再声明一个@luogu.Test
 * 以为会由于就近原则的原因JVM无法定位注解到对应的包中，而是定位到上一层你声明的@Test中
 */
public class Demo {
    @Test
    public void Demo1() {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int number = 0;
        number = sc.nextInt();
        System.out.println("number = " + number);

        System.out.println("Demo2 = " + Demo2(number));


    }

    public int Demo2(int a) {
/*        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();*/
        a = a + 10;

        return a;
    }

    @Test
    public void Demo3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        int a = 1;
//        a = a +0.1;
        System.out.println(a + 0.1);
        int b = 1;
        b += 0.1;
        System.out.println(b);
        int c = 105;
        c /= 1;
        System.out.println(c);
        c /= 1.0;
        System.out.println(c);
        c /= 1.3;
        System.out.println(c);
        float d = 0;
        d = d + 1;
        System.out.println(d);
        d +=1;
        System.out.println(d);

    }


    @Test
    public void Demo4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int week  = 0;
       try {
           week = Integer.parseInt(sc.next());
       }catch (Exception e){
           System.out.println("你输入的不是数字");
       }
        System.out.println(week);
        switch (week){
            case 1:
                System.out.println("这是星期一");
                break;
            case 2:
                System.out.println("这是星期二");
                break;
            case 3:
                System.out.println("这是星期三");
                break;
            case 4:
                System.out.println("这是星期四");
                break;
            case 5:
                System.out.println("这是星期五");
                break;
            case 6:
                System.out.println("这是星期六");
                break;
            case 7:
                System.out.println("这是星期七");
                break;
            default:
                System.out.println("你输入的数字无效");
                break;
        }

    }
    @Test
    public  void Demo5(){

    }

}
