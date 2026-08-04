public class PlayerGameTest {
    public static void main(String[] args) {
        Player p1 = new Player("你");
        Player p2 = new Player("电脑");
        
        int a = p1.fist();
        int b = p2.fist();
        
        String[] names = {"石头", "剪刀", "布"};
        System.out.println(p1.getName() + "出了：" + names[a]);
        System.out.println(p2.getName() + "出了：" + names[b]);
        
        if (a == b) {
            System.out.println("平局");
        } else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0)) {
            System.out.println(p1.getName() + "赢了");
        } else {
            System.out.println(p2.getName() + "赢了");
        }
    }
}
