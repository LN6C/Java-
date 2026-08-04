public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("小明");
        st1.setAge(-1);
        st1.setId(123456);

        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getId());
    }
}
