public class test20 {
    public static void main(String[] args) {
        int arr[] = {33,5,22,44,55};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = arr[0];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值为:"+max);
    }
}
