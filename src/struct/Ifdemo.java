package struct;

import java.util.Scanner;

public class Ifdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score < 60 && score >= 0){
            System.out.println("不及格");
        }else if (score >= 60 && score<80 ){
            System.out.println("及格");
        }else if (score>= 80 && score < 90){
            System.out.println("良好");
        }else if(score >= 90 && score < 100){
            System.out.println("优秀");
        }else if (score == 100){
            System.out.println("满分");
        }else {
            System.out.println("输入分数有误");
        }
        scanner.close();
    }
}
