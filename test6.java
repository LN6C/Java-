import java.util.Scanner;

public class test6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的金额:");
        int money = sc.nextInt();
            if(money>=100){
                System.out.println("去吃网红餐厅！");
            }else{
                System.out.println("去吃沙县小吃！");
            }
        sc.close();
    }
}