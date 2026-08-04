学习基本数据类型
分为四类八种
整数，浮点数，字符，布尔
byte   float  char  boolean
short  double
int
long
特殊的是，long类型在输出的时候，后缀需要带L,float,也一样要带F,当然大小写都可以,建议大写

整数和小数取值范围大小关系
double > float > long > int > short > byte

标识符就是给类，方法，变量等起的名字
由数字，字母，下划线，美元符号组成，不能以数字开头，不能是关键字，区分大小写

| 类型        | 规范                             | 例子                         |
| --------- | ------------------------------ | -------------------------- |
| **类名**    | 大驼峰 `PascalCase`               | `HelloWorld`、`StudentInfo` |
| **变量/方法** | 小驼峰 `camelCase`                | `userName`、`getAge()`      |
| **常量**    | 全大写+下划线 `SCREAMING_SNAKE_CASE` | `MAX_SIZE`、`PI`            |
| **包名**    | 全小写，用点分隔                       | `com.example.demo`         |
