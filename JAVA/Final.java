class A {
    final int a = 80;

    final void change() {
        // a=60; leads to error
        System.out.println(a);
    }
}

final class B extends A {
    B() {
        System.out.println("This is a Final claas which cant be extended");
    } 
    // void change(){
      // System.out.println("This gives an error");
      // }
}

// class c extends B{
//     this gives error
// }
public class Final {
    public static void main(String[] args) {
        A obj = new A();
        obj.change();
        B obj1=new B();
    }
}
