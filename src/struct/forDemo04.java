package struct;

public class forDemo04 {
    //打印九九乘法表
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {
            //System.out.println();
            for (int i = 1; i <= j; i++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();

        }
    }
}
