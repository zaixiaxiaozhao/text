package array;

public class ArrayDemo08 {
    //稀疏矩阵的存储-->转换为稀疏数组
    public static void main(String[] args) {
        //1、创建一个二维数组11*11    0代表没有棋子，1代表黑棋，2代表白棋
        int[][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;

        System.out.println("输出原始的数组");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("====================");
        //转换为稀疏数组保存
        //1、获取有效值的个数
        int sum = 0;
        for (int i = 0; i <11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("输出有效值的个数" + sum);
        //2、创建一个稀疏数组
        int[][] array1 = new int[sum + 1][3];       //sum + 1代表总共多少行数据，3代表每一行包括元素的个数，分别是行、列和值
        array1[0][0] = 11;
        array1[0][1] = 11;
        array1[0][2] = sum;             //第一行的数据内容，分别代表一共多少行，多少列，棋子的个数

        //遍历二维数组，将非零的值存放到稀疏数组中
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0){
                    count++;
                    array1[count][0] = i;
                    array1[count][1] = j;
                    array1[count][2] = array[i][j];
                }
            }
        }
        System.out.println("输出稀疏数组" );
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i][0] + "\t" + array1[i][1] + "\t" + array1[i][2] );
        }

        //稀疏矩阵还原原矩阵
        System.out.println("==========还原============");
        //读取稀疏数组
        int[][] array2 = new int[array1[0][0]][array1[0][1]];
        //还原其中的值
        for (int i = 1; i < array1.length; i++) {
            array2[array1[i][0]][array1[i][1]] = array1[i][2];
        }
        //打印
        for (int[] ints : array2) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
