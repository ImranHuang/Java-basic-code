import java.util.Random;

public class Test3 {

    public static void main(String[] args) {

/*
需求:
定义方法实现随机产生一个5位的验证码验证码格式:长度为5前四位是大写字母或者小写字母最后一位是数字
 */

//方法:
//在以后如果我们要在一堆没有什么规律的数据中随机抽取//可以先把这些数据放到数组当中
//再随机抽取一个索引

//1、大写字母和小写字母添加到数组中

        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                // a===97
                chs[i] = (char) (97 + i);
            } else {

                // A==65
                chs[i] = (char) (65 + i - 26);
            }

        }
//2、随机抽取4次
 //随机抽取数组中的索引
        String result="";

        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int randomIdex=r.nextInt(chs.length);
            result=result+chs[randomIdex];

        }
        System.out.println(result);

//3、随机抽取一个数字 0~9
int numbe=r.nextInt(10);
        result=result+numbe;

        System.out.println(result);


    }


}











