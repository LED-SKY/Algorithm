package Stage3;

import Stage3.entity.CRUD;
import Stage3.entity.Student;
import Stage3.utils.ScannerUtils;

/**
 * @program: statge1
 * @description: 阶段三任务
 * @author: 邓造坚
 * @create: 2021-06-15 21:47
 **/
public class welcome {
    private static Student[] students = new Student[6];

    {
        Student stu1 = new Student(1, "张三", "男", 18, "Java", "16255421465");
        Student stu2 = new Student(2, "小黄", "女", 28, "C++", "18524269317");
        students[0] = stu1;
        students[1] = stu2;
    }
    public static void main(String[] args) {
        new welcome();
        start();
    }

    //菜单界面
    public static void Menu() {
        System.out.println("--------------王道Java学生管理系统--------------");
        System.out.println("                    1.学生列表");
        String[] crud = new String[]{"增加", "删除", "修改", "查询"};
        for (int i = 0; i < crud.length; i++) {
            System.out.println("                    " + (i + 2) + "." + crud[i] + "学生");
        }

        System.out.println("                    6.退出系统");
        System.out.print("请选择功能（1-6）：");
    }


    //    开始界面逻辑
    public static void start() {
        int exitIn;
        int chooseIn;
        CRUD crud = new CRUD();
        crud.studs = students;

        while (true) {
            Menu();
            chooseIn = ScannerUtils.getMenuNumber();
            switch (chooseIn) {
                case 1:
                    System.out.println("进入学生列表功能");
                    crud.searchStudent();
                    break;
                case 2:
                    System.out.println("进入增加学生功能");
                    crud.addStudent();
                    break;
                case 3:
                    System.out.println("进入删除学生功能");
                    crud.deleterStudent();
                    break;
                case 4:
                    System.out.println("进入修改学生功能");
                    crud.updaterStudent();
                    break;
                case 5:
                    System.out.println("进入查询学生功能");
                    crud.searchAloneStudent();
                    break;
                case 6:
                    System.out.println("确认退出吗（1/2）:");
                    exitIn = ScannerUtils.outSystem();
                    if (exitIn == 1) {
                        System.out.println("感谢使用本系统！");
                        System.exit(0);
                    } else if (exitIn == 2) {
                        System.out.println("欢迎重新进入本系统");
                        break;
                    }
                {
                    System.out.println("你输入的数字有误");
                }
                break;
                default:
                    System.out.println("请重新选择");
            }
        }
    }
}




