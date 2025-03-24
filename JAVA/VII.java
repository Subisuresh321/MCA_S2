class Employee{
    int emp_id;
    String emp_name;
    int ta;
    int hra;
    int salary;
    Employee(int emp_id,String emp_name,int ta,int hra,int salary)
    {
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.hra=hra;
        this.ta=ta;
        this.salary=salary;
    }

    void getTotSalary(){
        int sum=hra+ta+salary;
        System.out.println("The total salary of "+emp_name+" is "+sum);
    }
}
public class VII {
    public static void main(String[] args) {
        Employee obj1=new Employee(101, "Subi", 2000, 8000, 30000);
        obj1.getTotSalary();
    }
}
