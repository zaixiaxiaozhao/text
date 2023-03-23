package scanner;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("use next out");
        if (scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的结果为" + str);
        }

        scanner.close();
    }
}
