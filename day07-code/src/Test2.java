public class Test2 {
    public static void main(String[] args) {

        //判断 101 ~ 200 之间有多少个素数，并除数所有素数
        //思路一: 2~ 9
        int count = 0;
        for (int i = 101; i <= 200; i++) {


            //找质数

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                count++;
                System.out.println("数字" + i + "是一个质数");
            }
            //找质数end

        }
        System.out.println(count);
    }

}
