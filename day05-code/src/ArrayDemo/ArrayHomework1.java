package ArrayDemo;

public class ArrayHomework1 {
    public static void main(String[] args) {
        /*
        求最值
         */
        int[] num={33,5,22,44,55};
int max=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>=max){
                max=num[i];
            }
        }

        System.out.println("最大值"+"\t"+max);
    }




}
