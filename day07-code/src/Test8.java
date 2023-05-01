public class Test8 {
    public static void main(String[] args) {
        /*某系统的数字密码(大于e) 。比如1983，采用加密方式进行传输，规则如下:
每位数加上5
再对1@求余，
最后将所有数字反转，
得到一中新数。
按照以上规则进行解密:
比如1983加密之后变成8346，解密之后变成1983*/

        //1、定义数组记录解密之后的数据
        int[] arr={8,3,4,6};
        //2、反转数组

        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
           int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //3、由于加密是通过对10取余的方式获取
        //解密的时候需要判断，0~4之前+10；5~9之间不变
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0&&arr[i]<=4)
                arr[i]=arr[i]+10;
        }

        //4、每一位减5
        for (int i = 0; i < arr.length; i++) {
                arr[i]=arr[i]-5;
        }

        //5、解密的结果
        int number=0;
        for (int i = 0; i < arr.length; i++) {
           number=number*10+arr[i];
        }
        System.out.print("解密的结果:"+number);







    }
}
