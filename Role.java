import java.util.Random;

public class Role {
    //成员变量(属性)
    private String name;
    private int blood;

    //创建无参构造和有参构造
    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    //创建方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role){
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
        //修改挨揍的人的血量
        int remainBlood = role.getBlood()-hurt;
        //对剩余血量做一个验证，如果为负数，就修改为0,下面两种方式均可
        //remainBlood = remainBlood < 0 ? 0 : remainBlood;
        if (remainBlood<0) {
            remainBlood = 0;
        }
        //修改挨揍人的血量
        role.setBlood(remainBlood);
        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头,打了"+role.getName()+"一下"+"造成了"+hurt+"点伤害,"+role.getName()+"还剩下"+remainBlood+"点血");
    }
}
