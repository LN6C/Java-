public class test11 {
    public static void main(String[] args) {
        int number = 0;
        for(int i = 1; i <=5; i++){
            number = number + i;
            System.out.println("进行第"+i+"次累加:"+"值为:"+number);
        }
        System.out.println("最终结果为:"+number);
    }
}
