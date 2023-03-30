package ArrayDemo;

public class ArrTest2 {
    public static void main(String[] args) {
        /*
        定义一个数组，用来存储班级50个同学的名字
        姓名未知，等学生报道之后再进行添加
         */
        String[] studentName=new String[50];//初始化为输入值，结果打印为null


        for (int i = 0; i < studentName.length; i++) {
            System.out.println(studentName[i]);
        }


    }


}
