import java.util.Scanner;
import java.util.ArrayList;
public class LibrarySystem {
    //子菜单
    public static void main(String[] args) {
        start();
    }
    //添加图书
    public static void addBook(ArrayList<Library>list,Scanner sc){
        Library lb = new Library();
        while(true){
            System.out.println("请输入图书ISBN:");
            String isbn = sc.next();
            if (!contains(list, isbn)) {
                System.out.println("ISBN可用,继续");
                lb.setIsbn(isbn);
                break;
            }else{
                System.out.println("ISBN已存在,请重新录入!");
                continue;
            }
        }
        String bookName;
        String author;
        double price;
        String category;
        while(true){
            
            System.out.println("请输入书名:");
            bookName = sc.next();
            lb.setTitle(bookName);
            System.out.println("请输入作者:");
            author = sc.next();
            lb.setAuthor(author);
            System.out.println("请输入价格:");
            price = sc.nextDouble();
            lb.setPrice(price);
            System.out.println("请输入分类:");
            category = sc.next();
            lb.setCategory(category);
            list.add(lb);
            System.out.println("图书信息添加成功!");
            break;
        }
    }
    //删除图书
    public static void deleteBook(ArrayList<Library>list,Scanner sc){
        while (true) {
            System.out.println("请选择删除的图书ISBN:");
            String isbn = sc.next();
            int index = findIndex(list, isbn);
            if (index >= 0) {
                list.remove(index);
                System.out.println("ISBN为"+isbn+"的图书删除成功");
                break;
            }else{
                System.out.println("ISBN不存在,删除失败!");
                continue;
            }
        }
    }
    //查找索引
    public static int findIndex(ArrayList<Library>list,String isbn){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIsbn().equals(isbn)) {
                return i;
            }
        }
        return -1;
    }
    //语义糖
    public static boolean contains(ArrayList<Library>list,String isbn){
        return findIndex(list,isbn) >= 0;
    }
    //修改图书
    public static void updateBook(ArrayList<Library>list,Scanner sc){
        while(true){
            System.out.println("请输入要修改图书的ISBN:");
            String isbn = sc.next();
            int index = findIndex(list, isbn);
            if (index < 0) {
                System.out.println("要修改的ISBN"+isbn+"不存在,请重新输入!");
                continue;
            }

            Library lb = list.get(index);
            System.out.println("ISBN存在,依次输入新信息:");
            System.out.println("请输入要修改的书名:");
            String bookName = sc.next();
            lb.setTitle(bookName);
            System.out.println("请输入要修改的作者:");
            String author = sc.next();
            lb.setAuthor(author);
            System.out.println("请输入要修改的价格:");
            double price = sc.nextDouble();
            lb.setPrice(price);
            System.out.println("请输入要修改的分类:");
            String category = sc.next();
            lb.setCategory(category);
            System.out.println("图书信息修改成功!");
            break;
        }
    }
    //查询图书
    public static void queryBook(ArrayList<Library>list,Scanner sc){
        while(true){
            if (list.size()==0) {
                System.out.println("当前无图书信息,请添加后查询");
                break;
            }
            System.out.println("ISBN\t书名\t作者\t价格\t分类");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getIsbn()+"\t"+list.get(i).getTitle()+"\t"+list.get(i).getAuthor()+"\t"+list.get(i).getPrice()+"\t"+list.get(i).getCategory());
            }
            break;
        }      
    }

    public static void start(){
        ArrayList <Library>list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("----------欢迎使用图书管理系统----------");
            System.out.println("1.添加图书");
            System.out.println("2.删除图书");
            System.out.println("3.修改图书");
            System.out.println("4.查询图书");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            String choose = sc.next();
            switch (choose) {
                case "1" -> addBook(list, sc);
                case "2" -> deleteBook(list, sc);
                case "3" -> updateBook(list, sc);
                case "4" -> queryBook(list, sc);
                case "5" -> {
                    System.out.println("退出");
                    return;
                }
                default -> System.out.println("没有这个选项!");
            }
        }
    }
}
