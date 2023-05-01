import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        //在唱歌比赛中，有6名评委给选手打分，分数范围是[ 0- 100]之间的整数。
// 选手的最后得分为:去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
//分析:
//1.定义一个数组，用来存储6名评委的打分 (0~100)
int[] scoreArr=getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
//2.求出数组中的最大值
     int max=   maxNumber(scoreArr);
        System.out.println("最大值是："+max);
//3.求出数组中的最小值
        int min=   MinNumber(scoreArr);
        System.out.println("最小值是："+min);

//4.求出数组中6个分数的总和
int sum=GetSum(scoreArr);

//5.(总和 - 最大值 - 最小值 ) /4
int lastScore=(sum-max-min)/(scoreArr.length-2);

        System.out.println(lastScore);
    }

    public  static int GetSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }


    public static int maxNumber(int[] scoreArr ){

        int max=scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(max<=scoreArr[i]){
                max=scoreArr[i];
            }
        }

        return max;

    }

    public static int MinNumber(int[] scoreArr ){

        int min=scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if(min<scoreArr[i]){
                min=scoreArr[i];
            }
        }

        return min;

    }
    public  static int[] getScores() {
        //定义数组
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < scores.length; ) {
            System.out.println("请第个" + (i + 1) + "评委输入打分！");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入，当前的i为：" + i);
            }

        }
        return scores;

    }



}
