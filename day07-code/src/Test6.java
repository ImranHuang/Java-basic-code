import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*数字加密
需求:
某系统的数字密码(大于0)，比如1983，采用加密方式进行传输
规则如下:
先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数*/


        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要加密的数字");
        int number=sc.nextInt();
        //1、把整数里面的每一位数字放到数组中

        //1、计算出数组的长度
       // int number = 12345;

        //定义一个临时变量记录number的值

        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while (number != 0) {
            //每一次循环去掉右边的一个数字
            number = number / 10;
            count++;
        }
        System.out.println("该数字有" + count + "位");

        //2、定义数组
        //动态初始化

        int[] arr = new int[count];

        //3、把整数上的数字添加到数字中

        int index = arr.length - 1;

        while (temp != 0) {
            //获取temp中的每一个数字
            int ge = temp % 10;
            //再去掉最右边的数字
            temp = temp / 10;
            //把当前获取到的个位数添加到数组中
            arr[index] = ge;
            index--;

        }
        /* for (int i = 0,j=arr.length-1; i <j; i++,j--) {

            int num=arr[i];
            arr[i]=arr[j];
            arr[j]=num;

        }*/
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }*/

       // int[] arr = {1, 9, 8, 3};


        //2、加密
        //每位数字加5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //对数组进行反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }

/*        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }*/


        //3、把数组里面的每一个数字进行拼接，变成加密之后的结果
        int number1 = 0;
        for (int i = 0; i < arr.length; i++) {
            number1 = number1 * 10 + arr[i];
        }
        System.out.println("加密的结果是：" + number1);


    }
}
