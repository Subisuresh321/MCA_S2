class Employee{
    int emp_id;
    String name;
    String address;
    
    Employee(int emp_id,String name,String address){
        this.emp_id=emp_id;
        this.name=name;
        this.address=address;
    }

    void display(){
        System.out.println("Emp_id: "+emp_id);
        System.out.println("Name: "+name);
        System.out.println("address: "+address);
    }
}

class Teacher extends Employee{
    String dept;
    String subj;
    Teacher(int emp_id,String name,String address,String dept,String subj){
        super(emp_id, name, address);
        this.dept=dept;
        this.subj=subj;
    }
    void display(){
        super.display();
        System.out.println("Department: "+dept);
        System.out.println("Subject: "+subj);
    }
}
public class X {
    public static void main(String[] args) {
        Teacher[] objs=new Teacher[5];
        objs[0]=new Teacher(101, "Reshmi", "Kombth Veetil" , "BCA", "OS");
        objs[1]=new Teacher(102, "Subi", "Pathiyoor" , "BCA", "Maths");
        objs[2]=new Teacher(103, "Tharun", "Ponjikera" , "Mech", "Dynamics");
        objs[3]=new Teacher(104, "Thankan", "Aisa Vila" , "MCA", "DSA");
        objs[4]=new Teacher(105, "Anju", "chebth Veetil" , "BCA", "AI");
        for(Teacher x:objs){
            x.display();
            System.out.println();
        }
}
}
