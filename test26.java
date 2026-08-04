import java.util.Scanner;

/*public class test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格:");
        double jg = sc.nextInt();
        System.out.println("请输入月份:");
        int yf = sc.nextInt();
        System.out.println("请输入机舱型号:(0为头等舱,1为经济舱)");
        int jc = sc.nextInt();
        if(yf >=5 && yf <= 10){
            if(jc==0){
                jg=jg*0.9;
            }else if(jc==1){
                jg=jg*0.85;
            }else{
                System.out.println("没有这个舱位!");
            }
        }else if((yf >=1 && yf<=4)||(yf >=11 && yf<=12)){
            if(jc==0){
                jg=jg*0.7;
            }else if(jc==1){
                jg=jg*0.65;
            }else{
                System.out.println("没有这个舱位!");
            }
        }else{
            System.out.println("输入不合法!");
        }
        System.out.println("价格为:"+jg);
    sc.close();
    }
}
*/
public class test26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入机票价格:");
        double jg = sc.nextDouble();        
        
        System.out.println("请输入月份:");
        int yf = sc.nextInt();
        
        System.out.println("请输入机舱型号:(0为头等舱,1为经济舱)");
        int jc = sc.nextInt();
        
        // 调用方法计算，main 只管输入输出
        double result = calcPrice(jg, yf, jc);
        System.out.println("价格为:" + result);
        
        sc.close();
    }
    
    // 抽出来的方法：只管计算，不管输入输出
    public static double calcPrice(double price, int month, int cabin) {
        double discount = 1.0;
        
        if (month >= 5 && month <= 10) {   // 旺季
            if (cabin == 0) {
                discount = 0.9;
            } else {
                discount = 0.85;
            }
        } else {                            // 淡季
            if (cabin == 0) {
                discount = 0.7;
            } else {
                discount = 0.65;
            }
        }
        
        return price * discount;
    }
}
