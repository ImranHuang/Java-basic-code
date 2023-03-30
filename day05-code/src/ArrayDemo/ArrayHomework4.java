package ArrayDemo;

import java.util.Random;

public class ArrayHomework4 {
    public static void main(String[] args) {
//需求:定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
      /* int[] arr={1,2,3,4,5};
        Random r=new Random();
      int randomIdex=  r.nextInt(arr.length);
        System.out.println(randomIdex);*/
//1、定义一个数组
        int[] arr={1,2,3,4,5};
        //2、循环遍历数组，从0索引开始打乱数据的顺序
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIdex=  r.nextInt(arr.length);
            int temp=arr[i];
            arr[i]=arr[randomIdex];
            arr[randomIdex]=temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }




}
