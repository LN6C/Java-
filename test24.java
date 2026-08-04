public class test24 {
    public static void main(String[] args) {
        double sum = getArea(10);
        System.out.println(sum);
    }
    public static double getArea(double radius){
        double result = radius*radius*3.14;
        return result;
    }
}
