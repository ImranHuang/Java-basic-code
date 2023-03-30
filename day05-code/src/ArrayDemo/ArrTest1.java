package ArrayDemo;

public class ArrTest1 {
    public static void main(String[] args) {
        /*
        定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素
        要求：
        1、如果是奇数，则将当前数字扩大两倍
        2、如果是偶数，则将当前数字变成二分之一
         */

        int[] array={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]%2==0)
            {
                array[i]/=2;
            }
            else if(array[i]%2!=0)
            {
                array[i]*=2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }





}
