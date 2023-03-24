package array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        //打印二维数组
        printArrays(array[0]);
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array.length);
        System.out.println(array[0].length);
        for (int a = 0; a < array.length; a++) {
            for (int i = 0; i < array[a].length; i++) {
                System.out.print(array[a][i] + " ");
            }
        }
    }

    //打印数组元素
    public static void printArrays(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "\t");
        }
    }
}
