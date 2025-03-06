class Base{
    Base(){
        System.out.println("This is base class default constructor");
    }
    void display(){
        System.out.println("This is base Display");
    }
}

class Child extends Base{
    int x;
    Child(){
        System.out.println("This is a child class constructor!!!");
    }
    void display(int n){
        x=n;
        System.out.println("This is child Display");
        System.out.println(x);
    }
}
public class InhMethOverload {
    public static void main(String[] args) {
        Child obj1=new Child();
        obj1.display(8);
        System.out.println();
        obj1.display();
    }
}
