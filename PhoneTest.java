public class PhoneTest {
    public static void main(String[] args) {
        Phone[] p = new Phone[3];
        Phone p1 = new Phone("vivo",6999, "蓝色");
        Phone p2 = new Phone("苹果",9999, "橙色");
        Phone p3 = new Phone("oppo",7999, "红色");
        p[0]=p1;
        p[1]=p2;
        p[2]=p3;

        int sum = 0;
        for (int i = 0; i < p.length; i++) {
            Phone phone = p[i];
            sum += phone.getPrice();
            System.out.println(phone.getBrand()+", "+phone.getPrice()+", "+phone.getColor());
        }
        int avg = sum/p.length;
        System.out.println(avg);
    }
}
