public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(3);

        System.out.println("面积：" + r.getArea());        // 15
        System.out.println("周长：" + r.getPerimeter());  // 16

        r.setLength(-2);  // 触发非法提示
    }
}