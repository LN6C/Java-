import java.util.Random;
import java.util.Scanner;
public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sjs = r.nextInt(101);
        System.out.println("请输入你猜的数字:");
        for(int i=1;i<=5;i++){
            int number = sc.nextInt();
            if(sjs==number){
                System.out.println("猜对了!");
            }else if(number > sjs){
                System.out.println("猜大了!");
            }else{
                System.out.println("猜小了!");
            }
            if(i==5){
                System.out.println("数字是"+sjs);
            }
        }
        sc.close();
    }
}
