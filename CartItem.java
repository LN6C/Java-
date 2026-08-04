public class CartItem {
    private String goodsName;
    private double price;
    private int count;

    public CartItem() {
    }
    public CartItem(String goodsName, double price, int count) {
        this.goodsName = goodsName;
        this.price = price;
        this.count = count;
    }

    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public double getTotalPrice(){
        return this.price * this.count;
    }
}
