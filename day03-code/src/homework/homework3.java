package homework;

public class homework3 {
    public static void main(String[] args) {
        /* 逢7过，包含7或者7的倍数跳过 ，输出1-100之间所有满足条件的数字*/
        for (int i = 1; i <= 100; i++)
        {

            if(i%10==7||i/10%10==7||i%7==0){
                System.out.println(i+"\t"+"过");
                continue;
            }
            System.out.println(i);
        }


    }
}
