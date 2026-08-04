import java.util.Scanner;


public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();
        int gw = number % 10;
        int sw = number /10 % 10;
        int bw = number /100 % 10;
        System.out.println("个位数是:"+gw);
        System.out.println("十位数是:"+sw);
        System.out.println("百位数是:"+bw);
        sc.close();
    }
}
