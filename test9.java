import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数:");
        int number = sc.nextInt();
        if(number>=0 && number<=100){
            if(number>=95){
                System.out.println("奖励一辆自行车!");
            }else if(number>=90 && number <=94){
                System.out.println("奖励去游乐场玩一天!");
            }else if(number >=80 && number<=89){
                System.out.println("奖励变形金刚一个!");
            }else{
                System.out.println("奖励挨一顿打!");
            }
        }else{
            System.out.println("请输入正确的分数!");
        }
    sc.close();
    }
}
