package Stage3.utils;

import Stage3.entity.CRUD;
import Stage3.entity.Student;

import java.util.Scanner;

/**
 * @program: statge1
 * @description: 键盘输入工具类
 * @author: 邓造坚
 * @create: 2021-06-16 13:53
 **/
public class ScannerUtils {
    public static final Scanner sc = new Scanner(System.in);

    private ScannerUtils() {
    }

    public static Student inputStudent(CRUD crud) {
        System.out.print("请输入学号：");
        int stuId = crud.judgeStuId();
        if (stuId > -1) {

            System.out.print("请输入要录入学生的姓名：");
            String name = sc.nextLine();
            System.out.print("请输入要录入学生的性别：");
            String sex = sc.nextLine();
            System.out.print("请输入要录入学生的年龄：");
            String tempStringAge = sc.nextLine();
            int age = Integer.parseInt(tempStringAge);
            System.out.print("请输入要录入学生的班级：");
            String grade = sc.nextLine();
            System.out.print("请输入要录入学生的电话号码：");
            String phoneNum = sc.nextLine();
            return new Student(stuId, name, sex, age, grade, phoneNum);

        } else {
            return null;
        }


    }

    //获取用户输入的菜单选项
    public static int getMenuNumber() {
        int chooseIn;
        while (true) {
            try {
                //获取输入的字符串
                String s = sc.nextLine();
                //将字符串强制转换为Int类型
                chooseIn = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("你输入的不是整数");
            }

        }
        return chooseIn;
    }

    //    获取用户是否退出系统
    public static int outSystem() {
        int exitIn;
        exitIn = Integer.parseInt(sc.nextLine());
        return exitIn;
    }

    //  获取学号
    public static int getStuId() {
        int stuId;
        stuId = Integer.parseInt(sc.nextLine());
        return stuId;
    }
}
