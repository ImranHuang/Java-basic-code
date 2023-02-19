package homework;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args)
    {
        //求平方根，键盘输入一个大于等于2的整数，计算出平方根，只保留小数部分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int result = sc.nextInt();

        for (int i = 1; i < result; i++) {
            if (i * i == result) {
                System.out.println(i + "就是" + result + "平方根");
                break;
            } else if (i * i > result) {
                System.out.println(i - 1 + "就是" + result + "平方根整数部分");
                break;
            }
        }
    }
}
