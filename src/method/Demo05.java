package method;

import java.util.Scanner;

public class Demo05 {
    //阶乘 n!
    public static void main(String[] args) {
        System.out.println("输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = f(a);
        System.out.println(a + "的阶乘为" + b);

    }
    // n! 的方法
    public static int f(int n){
        if(n == 1)
            return 1;
        else
            return n*f(n-1);
    }
}
