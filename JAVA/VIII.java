import java.util.Scanner;
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
        Scanner sc=new Scanner(System.in);
        Employee[] objs={
            new Employee(101, "Subi", 20000),
            new Employee(102, "Abhishek", 50000),
            new Employee(103, "Gokul", 10000),
        };
        
        System.out.println("Enter the Emp_num to search: ");
        int num=sc.nextInt();
        for(Employee x:objs)
        {
            if(x.emp_num==num)
            {
                System.out.println("Employee Found!!!"); 
                System.out.println("Emp_Num: "+x.emp_num+" Emp_name: "+x.emp_name+" Salary: "+x.salary);
                num=-1;
            } 
        }
        if(num!=-1)
        System.out.println("Employee Not Found!!!");
    }
}
