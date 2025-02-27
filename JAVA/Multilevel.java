class Mother{
    String mname;
    Mother(String name1){
        mname=name1;
    }
}
class Father extends Mother{
    String fname;
    Father(String name1,String name2){
        super(name1);
        fname=name2;
    }
}
class Son extends Father{
    String sname;
    Son(String name1,String name2,String name3){
        super(name1, name2);
        sname=name3;
        System.out.println("Iam "+name3+" son of "+name1+" and "+name2);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Son s1=new Son("Babu","Vidya","Ram");
    }
}
