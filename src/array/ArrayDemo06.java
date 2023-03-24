package array;

import java.util.Arrays;

public class ArrayDemo06 {
    //Arrays类的应用
    public static void main(String[] args) {
        int[] a = {6,9,45,66,3,77,1,998};

        System.out.println(a);          //a是一个对象，返回的是一个哈希code值
        //打印数组元素 Arrays.toString( )
        System.out.println(Arrays.toString(a));

        //数组排序 Arrays.sort( );
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //数组填充 fill()
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,3);
        System.out.println(Arrays.toString(a));
    }
}
