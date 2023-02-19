package homework;

import java.util.Scanner;

public class homework5 {
    //求质数，只能被自身或者1整除的数

    public static void main(String[] args) {
//方法1：写一个循环，从2开始，一直判断到number-1为止，查看在该范围内是否有数字可以被整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;
       /* for (int i = 2; i <= number - 1; i++)
        {
            if (number % i == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
*/
        //81=9*9
        //81=3*27
        //81=1*81
        //假设a*b=81,其中一个必定小于等于9，另一个必定大于等于9
        //方法2:以这个数字的平方根为中心判断

        for (int i = 2; i < Math.sqrt(number); i++)
        {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
    }
}
