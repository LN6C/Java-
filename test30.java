import java.util.Scanner;

public class test30{
    public static void main(String[] args) {
        int arr[] = getScores();
        int max = arr[0];
        int min = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
            count = count+arr[i];
        }
        System.out.println("总分为:"+((count-max-min)/4));
    }

    public static int[] getScores() {
        int []scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委打分:");
            int score = sc.nextInt();
            if (score>=0 && score<=100) {
                scores[i]=score;
                i++;
            }else{
                System.out.println("输入成绩不合法!");
            }
        }
        sc.close();
        return scores;
    }
}