import java.util.Random;
import java.util.Scanner;

public class Test11 {
    //双色球模拟系统

    public static void main(String[] args) {
        //1、生成中奖号码

        int[] arr = creatNumber();
        System.out.println("======================");


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("======================");
        //2、用户输入彩票号码
       int[] userInputArr= userInput();
/*        for (int i = 0; i < userInputArr.length; i++) {
            System.out.print(userInputArr[i]+" ");
        }*/

        //3、判断用户中奖情况
        //红球  蓝球
        int redCount=0;
        int blueCount=0;

        //判断红球
        for (int i = 0; i < userInputArr.length-1; i++) {
            int redNumber=userInputArr[i];
          // boolean flag= contains(arr,redNumber);
            for (int j = 0; j < arr.length-1; j++) {
                if(redNumber==arr[i]){
                    redCount++;
                    //如果找到了，后面的数字就不需要再判断
                    break;
                }
            }

        }

        //判断蓝球
        int blueNumber=userInputArr[userInputArr.length-1];
        if(blueNumber==arr[arr.length-1]){
            blueCount++;
        }
        System.out.println("红球中奖个数"+redCount);
        System.out.println("蓝球中奖个数"+blueCount);


        //根据两种球来判断中奖情况


    }

    public static int[] creatNumber() {
        //1、创建数组用于存储中奖号码
        //6个红球，1个蓝球
        int[] arr = new int[7];

        //2、随机生成号码并添加到数组中
        //红球：不能重复
        //蓝球：可以跟红球重复
        Random r = new Random();
        //生成红球号码
        for (int i = 0; i < 6; ) {
            int redNumber = r.nextInt(33 + 1);
            boolean flag = contains(arr, redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }

        //生成蓝球号码
        int blueNumber = r.nextInt(16 + 1);
        arr[arr.length - 1] = blueNumber;
        return arr;
    }

    //用于判断数字是否在数组中存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] userInput() {
        //1、创建数组用于添加用户购买的彩票号码
        //6个红球，1个蓝球 数组长度：7
        int[] arr = new int[7];

        //2、利用键盘录入让用户输入中奖号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            //redNumber 在1~33  唯一不重复

            if (redNumber >= 1 && redNumber <= 33) {
                boolean flag = contains(arr, redNumber);
                if (!flag) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红球超出范围");
            }
        }
        //让用户输入蓝球号码
        System.out.println("请输入蓝球号码");
        //1~16
        while (true) {
            int bueNumber = sc.nextInt();

            if (bueNumber >= 1 && bueNumber <= 16) {
                arr[arr.length - 1] = bueNumber;
                break;
            } else {
                System.out.println("当前蓝球超出范围，请重新输入");
            }
        }

        return arr;
    }

}
