class Employee{
    int emp_num;
    String emp_name;
    int salary;
    Employee(int emp_num,String emp_name,int salary)
    {
        this.emp_num=emp_num;
        this.emp_name=emp_name;
        this.salary=salary;
    }
}
public class VIII {
    public static void main(String[] args) {
        Employee[] objs={
            new Employee(101, "Subi", 20000),
            new Employee(102, "Abhishek", 50000),
            new Employee(103, "Gokul", 10000),
        };
        


    }
}
