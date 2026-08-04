public class Pet {
    private String name;
    private String type;
    private int health;

    public Pet() {
    }
    public Pet(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void heal(int amount){
      this.health += amount;
      if (this.health>100) {
            this.health = 100;
      }
      System.out.println(this.name + "接受了治疗,并恢复了" + this.health + "健康值");
    }
}
