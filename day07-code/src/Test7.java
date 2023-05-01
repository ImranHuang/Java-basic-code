public class Test7 {

    public static void main(String[] args) {
        //需求：
        //把整数上的每一位都添加到数组中
        //反向推到

        //1、计算出数组的长度
        int number = 12345;

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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
