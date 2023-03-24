package array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[] a = {12,61,88,36,41,21,55,78,58,22};
        int[] b = {12,61,88,36,41,21,55,78,58,22};
        int[] c = {12,61,88,36,41,21,55,78,58,22};
        choiceSort(a);
        maoPaoSort(b);
        maoPaoSort1(c);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
    }

    //选择排序(自己写的)
    public static void choiceSort(int[] array){
        //外层循环判断走多少次
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，判断两数大小，交换位置
            int min = array[i];
            for (int j = i + 1; j < array.length  ; j++) {
                if (array[j] < min){
                    int temp = min;
                    min = array[j];
                    array[j] = temp;
                }
            }
            array[i] = min;
        }
    }

    //冒泡排序由小到大
    public static void maoPaoSort(int[] array){
        //外层循环判断走多少次
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，判断两数大小，交换位置
            for (int j = i; j < array.length - 1 ; j++) {
                if (array[j + 1] < array[i]){
                    temp = array[j+1];
                    array[j+1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    //冒泡排序由大到小----标准答案
    public static void maoPaoSort1(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，判断两数大小，交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] > array[j]) {              //仅改变大于小于号即可实现冒泡排序的正序排列和倒叙排列
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
