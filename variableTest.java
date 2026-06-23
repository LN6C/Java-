//导包
import java.util.Scanner;


public class variableTest{
    public static void main(String[] args){
       //创建对象
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入第一个整数:");
    //接收数据
    int number1 = sc.nextInt();

    System.out.println("请输入第二个整数:");
    int number2 = sc.nextInt();

    int sum = number1 + number2;

    System.out.print("结果为");
    System.out.print(sum);
    }
}
