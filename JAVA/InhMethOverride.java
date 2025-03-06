class A{
    int x,y;
    A(int a,int b)
    {
        x=a;
        y=b;
    }
    void display(){
        System.out.println(x+" and " +y);
    }
}

class B extends A{
    int z;
    B(int a,int b, int k){
        super(a,b);
        z=k;
        System.out.println(z);
    }
    void display(){
        super.display();
        System.out.println("This is derived class!!!");
    }

}

public class InhMethOverride {
    public static void main(String[] args) {
        B obj1=new B(5,6,7);
        obj1.display();
    }
}
