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

        System.out.println("-----------");
        //增强for循环,没有下标,适合打印输出，不适合操作
        for (int i : array) {
            System.out.println(i);
        }

        //调用方法反转数组
        System.out.println("-------------");
        int[] result = reverse(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }
    }
    //打印数组元素
    public static void printArrays( int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "/t");
        }
    }

    //数组的反转
    public static int[] reverse(int[] arrays){
        int[] result = new int[arrays.length];
        //反转
        for (int i = 0 , j = arrays.length - 1; i < arrays.length; i++ , j--) {
            result[j] = arrays[i];
        }

        return result;
    }
}
