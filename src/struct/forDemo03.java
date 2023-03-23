package struct;

public class forDemo03 {
    //用for循环输出1-1000能被5整除的数，并且每行输出三个
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if(i % 5 == 0) {
                System.out.print(i + "\t");     //print与println的区别是print每次输出完事之后不换行，而println输出完事之后自动换行
            }
            if(i % 15 == 0){
                System.out.println();           //两种换行方法
                //System.out.print("\n");
            }

        }
    }
}
