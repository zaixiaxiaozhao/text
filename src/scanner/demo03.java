package scanner;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        //输入多个数，求总和和平均数
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;

        }

        System.out.println(m +"个数的平均数是" +( sum/m ));
        scanner.close();
    }
}
