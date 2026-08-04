import java.util.Random;

public class test21 {
    public static void main(String[] args) {
        Random r =  new Random();
        int count = 0;
        int count1 = 0;
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            int sjs = r.nextInt(100)+1;
            arr[i]+=sjs;
        }
        for(int i =0;i<arr.length;i++){
            count = count+arr[i];
        }
        double pjs = count/10.0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<pjs){
                count1++;
            }
        }
        System.out.println("所有数据的和为:"+count);
        System.out.println("平均数为:"+pjs);
        System.out.println("比平均数小的数有"+count1+"个");

    }
}
