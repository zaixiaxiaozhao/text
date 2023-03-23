package struct;

public class switchDemo02 {
    public static void main(String[] args) {
        //jdk7之后switch表达式支持字符串比较
        String name = "小赵";
        switch (name){
            case "小赵":
                System.out.println("XiaoZhao");
                break;
            case "阿巴":
                System.out.println("aBa");
                break;
            default:
                System.out.println("搞错了，再来");
        }
    }
}
