import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------欢迎来到学生管理系统----------");
            System.out.println("请选择操作:1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list,sc);
                case "2" -> register(list,sc);
                case "3" -> forgetPassword(list,sc);
                case "4" -> {
                    System.out.println("谢谢使用,再见");
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    public static void login(ArrayList<User>list,Scanner sc){
        System.out.println("请输入用户名:");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户名"+username+"未注册,请先注册再登录!");
            return;
        }

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入密码:");
            String password = sc.next();

            while (true) {
                String rightCode = getCode();
                System.out.println("正确的验证码为:"+rightCode);
                System.out.println("请输入验证码:");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确!");
                    break;
                }else{
                    System.out.println("验证码错误,请重新输入!");
                    continue;
                }
            }

            User userInfo = new User(username, password, null, null);
            boolean result = checkUserInfo(list,userInfo);
            if (result) {
                System.out.println("登录成功,可以开始使用学生管理系统!");
                StudentSystem.start();
                return;
            }else{
                if (i!=3) {
                   System.out.println("登录失败,用户名或密码错误!还剩下"+(3-i)+"次机会!");
                }else{
                   System.out.println("机会用尽,账号被锁定,请联系管理员解锁账号!");
                }
            }
        }
    }

    public static void register(ArrayList<User>list,Scanner sc){
        String username;
        while (true) {
            System.out.println("请输入用户名:");
            username = sc.next();
            boolean flag1 = checkUsername(username);
            if (!flag1) {
                System.out.println("格式不正确,请重新输入!");
                continue;
            }
            boolean flag2 = contains(list, username);
            if (flag2) {
                System.out.println("用户名"+username+"已存在,请重新输入!");
            }else{
                System.out.println("用户名设置成功!");
                break;
            }
        }
        String password;
        while(true){
            System.out.println("请输入要注册的密码:");
            password = sc.next();
            System.out.println("请再次输入要注册的密码:");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("密码设置成功!");
                break;
            }else{
                System.out.println("两次密码输入不一致,请重新输入!");
                continue;
            }
        }
        String personID;
        while (true) {
            System.out.println("请输入身份证号码:");
            personID = sc.next();
            boolean flag = checkPersonID(personID);
            if (flag) {
                System.out.println("身份证号码正确!");
                break;
            }else{
                System.out.println("身份证号码格式有误,请重新输入!");
                continue;
            }
        }
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码:");
            phoneNumber = sc.next();
            boolean flag = checkPhoneNumber(phoneNumber);
            if (flag) {
                System.out.println("手机号正确");
                break;
            }else{
                System.out.println("手机号码格式有误,请重新输入!");
                continue;
            }
        }
        User user = new User(username, password, personID, phoneNumber);
        list.add(user);
        System.out.println("注册成功!");

        printList(list);
    }

    public static void forgetPassword(ArrayList<User>list,Scanner sc){
        System.out.println("请输入用户名:");
        String username = sc.next();
        boolean flag = contains(list, username);
        if (!flag) {
            System.out.println("用户名"+username+"未注册,请先注册再登录!");
            return;
        }
        System.out.println("请输入身份证号码:");
        String personID = sc.next();
        System.out.println("请输入手机号:");
        String phoneNumber = sc.next();

        int index = findIndex(list,username);
        User user = list.get(index);
        if (!(user.getPersonID().equalsIgnoreCase(personID) && user.getPhoneNumber().equalsIgnoreCase(phoneNumber))) {
            System.out.println("身份证或手机号输入有误,不能修改密码");
            return;
        }

        String password;
        while (true) {
            System.out.println("请输入新密码:");
            password = sc.next();
            System.out.println("再次输出新密码:");
            String againPassword = sc.next();
            if (password.equals(againPassword)) {
                System.out.println("两次密码输入一致");
                break;
            }else{
                System.out.println("两次密码输入不一致,请重新输入!");
                continue;
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功!");

    }

    public static boolean checkUsername(String username){
        int len = username.length();
        if (len < 3 || len > 15) {
            return false;
        }

        boolean hasLetter = false;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9'))) {
                return false;
            }
            if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')) {
                hasLetter = true;
            }
        }
        return hasLetter;
    }

    public static boolean contains(ArrayList<User>list,String username){
        return findIndex(list, username) >= 0;
    }

    public static boolean checkPersonID(String personID){
        if (personID.length()!=18) {
            return false;
        }
        if (personID.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < personID.length()-1; i++) {
            if (!(personID.charAt(i)>='0' && personID.charAt(i)<='9')) {
                return false;
            }
        }
        char endChar = personID.charAt(17);
        if (endChar=='x'||endChar=='X'||(endChar>='0'&& endChar<='9')) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean checkPhoneNumber(String phoneNumber){
        if (phoneNumber.length()!=11) {
            return false;
        }
        if (phoneNumber.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (!(c>='0'&& c<='9')) {
                return false;
            }
        }
        return true;
    }

    public static void printList(ArrayList<User>list){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getUsername()+","+user.getPassword()+","+user.getPersonID()+","+user.getPhoneNumber());
        }
    }

    public static String getCode(){
        ArrayList<Character>list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
        }

        int number = r.nextInt(10);
        sb.append(number);

        char[] arr = sb.toString().toCharArray();
        int randomIndex = r.nextInt(arr.length);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        return new String(arr);
    }

    public static boolean checkUserInfo(ArrayList<User>list,User userInfo){
        int index = findIndex(list, userInfo.getUsername());
        if (index < 0) {
            return false;
        }
        User user = list.get(index);
        return user.getPassword().equals(userInfo.getPassword());
    }

    public static int findIndex(ArrayList<User>list,String username){
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }
}
