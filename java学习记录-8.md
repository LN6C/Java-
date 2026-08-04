1. 面向对象
    面向对象是用"造东西"的思维方式组织代码：先设计类（图纸），再创建对象（实物），通过对象之间的交互完成功能。
2. 类与对象
    类就是共同特征的描述(设计图)
    对象就是真实存在的实例
    对象调用方法
    public class 类名{
        1.成员变量(属性)
        2.成员方法(行为)
    }
    格式
    类名 对象名 = new 类名();

    使用方法
    对象名.成员变量;//仅public可用，private属性必须通过getter/setter访问
    对象名.成员方法();

3. javaBean类和测试类
    人话就是一个管生产，一个管测试
    看到 private + getter/setter → 这是 JavaBean（封装数据的）
    看到 main 方法 + new 对象 + 调方法 → 这是测试类（用别人的）
    看到 @Test 注解 → 这是 JUnit 测试类（更专业的测试）

4. 修饰符
    是一个权限修饰符
    可以修饰成员
    private关键字只能在本类中才能访问
    简单来说就是private让数据私有化,然后public就是公开内容

    为什么要 private + getter/setter？
    ↓
    1. 数据安全：防止外面直接赋个 -100 岁
    2. 控制入口：所有修改必须经过 setter，可以加判断
    3. 便于维护：改规则只改一处，不用改一百个地方
    
    权限从大到小：
    public  >  protected  >  默认（不写）>  private
     ↓          ↓            ↓            ↓
    全世界    同包+子类      同包内        本类

5. this,局部变量和成员变量,就近原则
    1. 就近原则
        System.out.println(age);
        System.out.println(this.age);
        不使用this就是指向最近的变量
    2. this
        可以区别局部变量和成员变量
    3. 局部变量和全局变量
        public class Student {
            private String name;//成员变量
            private int age;
            private int id;

            public void setName(String n){
                name = n;//局部变量
            }
            public String getName(){
                return name;
            }
        }

        变量在哪里声明的，就叫什么变量
········├─ 声明在 类里面、方法外面 → 成员变量（Member Variable）
········└─ 声明在 方法里面 / 参数列表里 / 代码块里 → 局部变量（Local Variable）

6. 构造方法

    概述:
    构造方法也叫构造器，构造函数
    作用:在创建对象的时候给成员变量进行赋值

    特点:
    方法名与类名相同,大小写也要一致
    没有返回值类型,连void也没有
    没有具体返回值

    创建对象时由虚拟机调用，不能手动构造方法
    每创建一次对象就调用一次构造方法

    构造方法有无参构造方法.在初始化对象时对象为默认值，有参构造方法，在初始化对象时可以为对象赋值

    任何类定义出来都自带无参构造器，当有了参数构造器，无参构造器就没有了，需要自己写无参构造器
    任何时候都写无参构造器和有参构造器

7. 标准的JavaBean类
    类名需要见名知意
    成员变量使用private修饰
    提供至少两个构造方法
    成员方法
    get,set