package method;

public class Demo04 {
    public static void main(String[] args) {
        //方法没有声明为static时，调用可变参数函数
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4,5);
    }
    //定义一个可变参数函数
    public void test(int... i){
        System.out.println(i[0]);

    }

}
