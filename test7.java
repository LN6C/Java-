import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的金额:");
        int money = sc.nextInt();
        int a = 600; 
            if(money>=a){
                System.out.println("付款成功！");
            }else{
                System.out.println("付款失败！");
            }
        sc.close();
    }
}
