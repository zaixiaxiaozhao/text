package array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] nums;             //1、声明一个数组
        nums = new int[10];     //2、创建一个数组
        nums[0] = 1;            //3、给数组元素赋值
        nums[1] = 2;            //3、给数组元素赋值
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        int sum = 0;            //计算数组的和
        for (int i = 0; i < nums.length ; i++) {    //获取数组的长度array.length
            sum = sum + nums[i];
        }
        System.out.println("数组元素的和为：" + sum);
    }
}
