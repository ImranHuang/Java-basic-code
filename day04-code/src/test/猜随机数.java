package test;

import java.util.Random;
import java.util.Scanner;

public class 猜随机数 {
    public static void main(String[] args) {
        //获取一个随机数
        //范围0~10
        Random r = new Random();

  /*      for (int i = 0; i < 100; i++) {
            int number=r.nextInt(10);//生产0-9的随机数
            System.out.println(number);
            }*/


        //生成一个7~15的随机数
        //1、头尾减去一个值，让范围从0开始  -7  0~8
        //尾巴加1  8+1
        //最终结果再加上第一步减去的值

/*        for (int i = 0; i < 100; i++)
        {
            int number=r.nextInt(9)+7;
            System.out.println(number);
        }*/

        int number = r.nextInt(100) + 1;
        System.out.println(number);
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (true)
        {
            System.out.println("请输入猜的数字！");
            int guessNumber = sc.nextInt();
            int a=i++;
            if(a==3){
                System.out.println("恭喜你猜中了");
                break;
            }

            if (guessNumber > number) {

                System.out.println("大了");
                System.out.println("猜了"+a+"次");
            } else if (guessNumber < number) {
                System.out.println("小了");
                System.out.println("猜了"+a+"次");
            } else {
                System.out.println("恭喜你猜中了");
                System.out.println("猜了"+a+"次");
                break;
            }
        }

    }


}



