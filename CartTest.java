public class CartTest {
    public static void main(String[] args) {
        CartItem[] cart = new CartItem[3];
        CartItem c1 = new CartItem("可乐",3.0,2);
        CartItem c2 = new CartItem("雪碧",3.0,4);
        CartItem c3 = new CartItem("芬达",3.0,1);
        cart[0] = c1;
        cart[1] = c2;
        cart[2] = c3;
        int sum = 0;
        //遍历输出每个商品的"名称 + 小计金额"，并计算购物车总价
        for (int i = 0; i < cart.length; i++) {
            CartItem c = cart[i];
             System.out.println(c.getGoodsName()+", "+c.getTotalPrice());
             sum += c.getTotalPrice();      
        }
        System.out.println("总价为:"+sum); 
    }
}
