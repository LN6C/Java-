import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的票号:");
        int number = sc.nextInt();
        if(number>=1 && number <= 100){
            if(number%2==1){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }else{
            System.out.println("请输入正确的票号!");
        }
        sc.close();
    }
}
