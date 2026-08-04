import java.util.Random;

public class test28 {

    public static void main(String[] args) {
        Random r = new Random();
        char []arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<=25) {
                arr[i]=(char)(97+i);
            }else{
                arr[i]=(char)(65+i-26);
            }
        }
        String result="";
        for (int i = 0; i < 4; i++) {
            int randomIndex=r.nextInt(arr.length);
            result=result+arr[randomIndex];
        }
        int number = r.nextInt(10);
        result = result +number;
        System.out.println(result);

    }
}
