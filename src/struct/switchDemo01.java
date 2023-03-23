package struct;

public class switchDemo01 {
    public static void main(String[] args) {
        //case具有穿透现象，要配合break使用
        char grade = '1';

        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
