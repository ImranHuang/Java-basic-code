package homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
/* 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");

        int x = sc.nextInt();
        int start = x;
        int num = 0;
        while (x != 0)
        {
            //从右往左获取每一个数字
            int ge = x % 10;
            //修改X的值
            x = x / 10;
            //把当前获取到的数字拼接到最左边
            num = num * 10 + ge;
            System.out.println(num);
        }
        if (start == num) {
            System.out.println(start + "是回数");

        } else {
            System.out.println(start + "不是回数");
        }
    }
}
