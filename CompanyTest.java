public class CompanyTest {
    public static void main(String[] args) {
        /*创建5个员工存入数组，求：
        平均工资
        工资最高的员工姓名
        工资最低的员工姓名*/
        Employee[] e = new Employee[5];
        e[0] = new Employee("小李",15000.0);
        e[1] = new Employee("小王",25000.0);
        e[2] = new Employee("小陈",35000.0);
        e[3] = new Employee("小张",10000.0);
        e[4] = new Employee("小宇",20000.0);
        double sum = 0;
        double max = e[0].getSalary();
        double min = e[0].getSalary();
        String maxName = e[0].getName();
        String minName = e[0].getName();
        for (int i = 0; i < e.length; i++) {
            double salary = e[i].getSalary();
            sum += salary;
            
            if (salary > max) {
                max = salary;
                maxName = e[i].getName();
            }
            if (salary < min) {
                min = salary;
                minName = e[i].getName();
            }
        }
        
        double avg = sum / e.length;
        
        System.out.println("平均工资为:" + avg);
        System.out.println("最低工资的人是:" + minName + " " + min);
        System.out.println("最高工资的人是:" + maxName + " " + max);
    }
}
