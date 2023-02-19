package homework;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位数" + "\t" + ge);
        System.out.println("十位数" + "\t" + shi);
        System.out.println("百位数" + "\t" + bai);
    }
}
