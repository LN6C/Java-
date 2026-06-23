今日学习java变量,打印区别,键盘录入方法

1.变量就是程序在执行操作的过程中，其值有可能发生改变的量
格式:数据类型 变量 = 值;
变量使用前需要赋值，变量可以多个一起赋值,如: int a = 10 , b = 20 , c = 30; a,b,c = 10 20 30 -----------------这个是错误的，这个是py的写法！！！
int a = ..... 前面这个类型是声明变量,如果需要重新声明变量的值,前面不需要加变量声明的 列如 a = 20即可

2.println()是指输出完换行
  print()指的是输出完不换行！

3.键盘录入方法,需要导包,创建对象,具体格式如下
import java.util.Scanner;
//这个需要写在类前面
//创建对象
Scanner sc = new Scanner(System.in);
//读整数
int num = sc.nextInt();
//读字符串
String str = sc.next();
//读小数
double d = sc.nextDouble();



