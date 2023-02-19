day3-code说明



homework1、获取整数的百，十，个位的数字并打印出来



```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入整数：");
    int number = sc.nextInt();
    int ge = number % 10;
    int shi = number / 10 % 10;
    int bai = number / 100 % 10;
    System.out.println("个位数" + "\t" + ge);
    System.out.println("十位数" + "\t" + shi);
    System.out.println("百位数" + "\t" + bai);
}
```





homework2、确认回数

```
/* 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。*/
```

```java
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个整数");

int x = sc.nextInt();
int start = x;
int num = 0;
while (x != 0)
{
    //从右往左获取每一个数字
    int ge = x % 10;
    //修改X的值
    x = x / 10;
    //把当前获取到的数字拼接到最左边
    num = num * 10 + ge;
    System.out.println(num);
}
if (start == num) {
    System.out.println(start + "是回数");

} else {
    System.out.println(start + "不是回数");
}
```



homework3、过7

/* 逢7过，包含7或者7的倍数跳过 ，输出1-100之间所有满足条件的数字*/

```
public static void main(String[] args) {    
    for (int i = 1; i <= 100; i++)
    {

        if(i%10==7||i/10%10==7||i%7==0){
            System.out.println(i+"\t"+"过");
            continue;
        }
        System.out.println(i);
    }


}
```

homework4、//求平方根，键盘输入一个大于等于2的整数，计算出平方根，只保留小数部分

```java
public static void main(String[] args) 
{
    //求平方根，键盘输入一个大于等于2的整数，计算出平方根，只保留小数部分
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个整数");
    int result = sc.nextInt();

    for (int i = 1; i < result; i++) {
        if (i * i == result) {
            System.out.println(i + "就是" + result + "平方根");
            break;
        } else if (i * i > result) {
            System.out.println(i - 1 + "就是" + result + "平方根整数部分");
            break;
        }
    }
}
```



homework5://求质数，只能被自身或者1整除的数

```
    public static void main(String[] args) {
//方法1：写一个循环，从2开始，一直判断到number-1为止，查看在该范围内是否有数字可以被整除
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        boolean flag = true;
       /* for (int i = 2; i <= number - 1; i++)
        {
            if (number % i == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
*/
        //81=9*9
        //81=3*27
        //81=1*81
        //假设a*b=81,其中一个必定小于等于9，另一个必定大于等于9
        //方法2:以这个数字的平方根为中心判断

        for (int i = 2; i < Math.sqrt(number); i++)
        {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
    }
```