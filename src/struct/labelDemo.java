package struct;

public class labelDemo {
    public static void main(String[] args) {
        //打印101-150之间所有的质数
        int count = 0;
        outer:for (int i =100 ; i<=150; i++){       //类似goto语句，outer是一个标签
            for (int j = 2; j < i/2; j++){
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.println( i + " ");
        }
    }
}
