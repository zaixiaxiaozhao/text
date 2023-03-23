package array;

public class ArrayDemo03 {
    //数组的使用
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        //打印所以数组元素
        for (int i = 0; i < array.length; i++) {
            System.out.println("数组元素为：" + array[i]);
        }

        //计算数组的元素之和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("数组的元素之和为" + sum);

        //查找最大元素
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("数组的最大元素为" + max );
    }
}
