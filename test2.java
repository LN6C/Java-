import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你衣服的时髦度(0到10之间的整数):");
        int myFashion = sc.nextInt();
        System.out.println("请输入对象衣服的时髦度(0到10之间的整数):");
        int girlFashion = sc.nextInt();
        boolean result = myFashion > girlFashion;
        System.out.println(result);
        sc.close();
    }
}
