import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎体重:");
        int tigerWeight1 = sc.nextInt();
        System.out.println("请输入第二只老虎体重:");
        int tigerWeight2 = sc.nextInt();
        System.out.println(tigerWeight1 == tigerWeight2? "相同":"不同"); 
        //赋值给String类型的变量也可以
        sc.close();
    }
}
