package struct;

public class continueDemo {
    //continue控制循环
    public static void main(String[] args) {

        int i = 0;
        while (i<100){
            i++;
            if (i%10 == 0){
                System.out.println();
                continue;                   //结束此次循环，跳到下一次循环
            }
            System.out.print(i + "\t");     //"\t"代表加空格，“\n"代表换行
        }
    }
}
