import java.util.Scanner;

/**
 * @Author 邓造坚
 * @Date 2021/6/9 下午 2:05
 * @Description 题目描述
 * 伦敦奥运会要到了，小鱼在拼命练习游泳准备参加游泳比赛，可怜的小鱼并不知道鱼类是不能参加人类的奥运会的。
 * <p>
 * 这一天，小鱼给自己的游泳时间做了精确的计时（本题中的计时都按24小时制计算），它发现自己从a时b分一直游泳到当天的c时d分，请你帮小鱼计算一下，它这天一共游了多少时间呢？
 * <p>
 * 小鱼游的好辛苦呀，你可不要算错了哦。
 * <p>
 * 输入格式
 * 一行内输入 4 个整数，分别表示 a, b, c, d。
 * <p>
 * 输出格式
 * 一行内输出 2 个整数 e 和 f，用空格间隔，依次表示小鱼这天一共游了多少小时多少分钟。其中表示分钟的整数 f 应该小于60。
 */
public class FishSwimming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt();
        int startMinutes = sc.nextInt();
        int endHour = sc.nextInt();
        int endMinutes = sc.nextInt();
        int hour = endHour - startHour;
        int minutes = endMinutes - startMinutes;

/*        if (startMinutes <= endMinutes) {
            System.out.print(hour + " " + (endMinutes - startMinutes));
        } else {
            System.out.print((hour - 1) + " " + ((endMinutes + 60) - startMinutes));
        }*/

        if (minutes < 0) {
            hour -= 1;
            minutes += 60;
        }
        System.out.println(hour + " " + minutes);

    }

public static void f(){
    System.out.println(1);
}


}
