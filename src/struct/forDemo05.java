package struct;

public class forDemo05 {
    //增强for循环
    public static void main(String[] args) {

        int[] number = {10,20,30,40,50};
        for (int i = 0; i < 5; i++) {
            System.out.print(number[i] + "\t");
        }
        System.out.println();
        //增强for循环，遍历数组的元素
        for (int x : number){               //把number的每一项值赋值给x
            System.out.print(x + "\t");
        }
    }
}
