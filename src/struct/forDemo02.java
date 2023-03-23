package struct;

public class forDemo02 {
    public static void main(String[] args) {

        int jiShu = 0;
        int ouShu = 0;
        for (int i = 0;i<=100;i++){
            if (i%2 == 0)
                ouShu = ouShu+i;
            else
                jiShu = jiShu+i;
        }
        System.out.println("偶数的和:" + ouShu);
        System.out.println("奇数的和:" + jiShu);
    }
}
