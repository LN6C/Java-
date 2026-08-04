public class PetTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet("小猫","猫",60);
        System.out.println(pet1.getName()+"治疗前的健康值"+pet1.getHealth());
        pet1.heal(50);
        System.out.println(pet1.getName()+"治疗后的健康值"+pet1.getHealth());
    }
}
