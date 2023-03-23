package method;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入第一个数：");
        Scanner a = new Scanner(System.in);
        int A = a.nextInt();
        System.out.println("请输入第二个数：");
        Scanner b = new Scanner(System.in);
        int B = b.nextInt();
        int c = max(A,B);
        System.out.println("两者比较，较大值为" + c);
    }

    //比大小
    public static int max(int num1, int num2){
        int result = 0;
        if (num1 < num2){
            result = num2;
        }
        if (num1 > num2){
            result = num1;
        }
        if (num1 == num2){
            return -1;
        }
        return result;
    }
}
