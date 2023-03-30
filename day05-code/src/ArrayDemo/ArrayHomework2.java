package ArrayDemo;

import java.util.Random;

public class ArrayHomework2 {
    public static void main(String[] args) {
        /*
        需求:生成10个1~100之间的随机数存入数组
        1)求出所有数据的和
        2)求所有数据的平均数
        3)统计有多少个数据比平均值小
         */
        int[] num = new int[10];
        int sum = 0;
        int count = 0;
//生产随机数
        Random r = new Random();

        for (int i = 0; i < num.length; i++) {
            int number = r.nextInt(100) + 1;//生产随机数的时候+1才能生产1~100的随机数
            num[i] = number;
        }

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("任意数" + (i + 1) + "\t" + num[i]);
            if (num[i] < sum / num.length) {
                count++;
            }
        }

        System.out.println("所有数据的和：" + "\t" + sum);
        System.out.println("所有数据的平均值：" + "\t" + sum / num.length);
        System.out.println("小于平均值的数据数量：" + "\t" + count);


    }
}
