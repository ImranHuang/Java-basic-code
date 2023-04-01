import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        /* 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。按照如下规则计算机票价格: 旺季(5-10月) 头等舱9折，经济8,5折，淡(11月到来年4月)头等舱7折，经济6,5折。*/
        //分析
        //1、键盘录入原价，月份，机票类型
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价！");
        int price = sc.nextInt();
        System.out.println("请输入当前的月份！");
        int month = sc.nextInt();
        System.out.println("请输入机票的类型！ 0 头等舱  1 经济舱");
        int seat = sc.nextInt();
        if (month >= 5 && month <= 10) {
/*            if (seat == 0) {
                price = (int) (price * 0.9);
                System.out.println("机票价格是：" + price);

            } else if (seat == 1) {
                price = (int) (price * 0.85);
                System.out.println("机票价格是：" + price);
            } else {
                System.out.println("没有这种类型的机票！");
            }*/
            price = getPrice(price, seat, 0.9, 0.85);

        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
/*            if (seat == 0) {
                price = (int) (price * 0.7);
                System.out.println("机票价格是：" + price);
            } else if (seat == 1) {
                price = (int) (price * 0.65);
                System.out.println("机票价格是：" + price);
            } else {
                System.out.println("没有这种类型的机票！");
            }*/
            price = getPrice(price, seat, 0.7, 0.65);

        } else {
            System.out.println("输入的月份不对，请重新输入！");
        }

        //2、判断当前月份是淡季还是旺季
        //  3、继续判断机票类型
    }

    //1、我要干嘛


    //2、我干这件事，需要什么才能完成


    //3、方法调用处是否需要继续使用这个结果

    public static int getPrice(int ticket, int seat, double v0, double v1) {
        if (seat == 0) {
            ticket = (int) (ticket * v0);
            System.out.println("机票价格是：" + ticket);
        } else if (seat == 1) {
            ticket = (int) (ticket * v1);
            System.out.println("机票价格是：" + ticket);
        } else {
            System.out.println("没有这种类型的机票！");
        }
        return ticket;
    }


}
