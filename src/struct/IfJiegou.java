package struct;

import java.util.Scanner;

public class IfJiegou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("Hello")){
            System.out.println(s);
        }else {
            System.out.println("End");
        }

        scanner.close();

    }
}
