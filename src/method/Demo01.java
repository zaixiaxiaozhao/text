package method;

public class Demo01 {
    public static void main(String[] args) {
        int add = add(1, 6);
        System.out.println(add);
    }

    //加法
    public static int add(int a, int b){            //static静态变量，可全局调用

        return a+b;
    }
}
