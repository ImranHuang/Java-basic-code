import java.util.Random;

public class Test9 {
    public static void main(String[] args) {

        /*抢红包需求:
        一个大V直播抽奖，奖品是现金红包，分别有2,588，888,1000,100001五个奖金。请使用代码模拟抽奖打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下: (随机顺序，不一定是下面的顺序)*/

        //分析：
        //1、定义数组表示奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        //2、定义新的数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];

        //3、抽奖
        Random r=new Random();
        //因为有5个奖项，所以循环5次
        for (int i = 0; i < 5; ) {
            int randomIndex=r.nextInt(arr.length);
            //获取随机奖项
            int prize=arr[randomIndex];
            //判断当前的奖项是否存在，如果存在重新抽取
            boolean flag=contains(newArr,prize);
            if(!flag){
                //把当前抽取到的奖项添加到newArr中
                newArr[i]=prize;
                //添加完毕之后，移动索引
                i++;
            }
        }
        //4、遍历newArr
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    //判断prize在数组中是否村咋
    //存在就返回true，否则返回false
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
