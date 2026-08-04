1. 循环与判断
    顺序结构
    System.out.println("......")
    Sys....
    Sys....
    依次执行，就叫顺序结构

    判断语句
    格式
    if(表达式){
        System.out.println(.....);
    }
    大括号可以另起一行书写，当代码只有一句的时候，大括号可以不写

    if(){

    }else if(){

    }....{

    }else{

    }

2. 分支语句，和上面的if else if else差不多，只是另一种写法
    
    switch(表达式){     //表达式也就是将要匹配的值，取值为，byte,short,int,char,String(JDK7+),枚举
        case值:        //case后面跟的是要和表达式比较的值，只能是字面量，不能是变量，case
                        给出的值不可以重复
            语句;
            break;
        case值:
            语句;
            break;
        .....
        default:
            语句;
            break;
        
    }

    default可以省略，但不建议，default位置写在哪里都可以，不一定要放在最后
    在语句中，去掉break就是case穿透
    case穿透可以写成 case 1, 2, 3, 4, 5: （JDK12+ 支持多 case 合并）

    switch里面也可以这样写（JDK12+ 箭头语法），多行代码case需要带{}，两种格式不能混写
    switch(noodles){
            case "兰州拉面"-> System.out.println("吃兰州拉面!"); 
        }

3. 循环结构
    格式
    for(初始化语句;条件判断语句;条件控制语句;){  //人话就是起点，终点，步长
        循环体;
    }

    while循环(先问后做，可能不做)
    格式
    初始化语句;
    while(条件判断语句){
        循环体语句;
        条件控制语句;
    }

    do while 循环(先做后问，最少做一次)
    格式
    初始化语句;
    do{
        循环体语句;
        条件控制语句;
    }while(条件判断语句);
