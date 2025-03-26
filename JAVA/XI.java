import java.util.Scanner;
interface Shape{
    void area();
    void perimeter();
}
class Circle implements Shape{
    int r;
    Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("The area is: "+(3.14*r*r));
    }
    public void perimeter(){
        System.out.println("the circumference is: "+(2*3.14*r));
    }
}
class Rectangle implements Shape{
    int l;
    int b;
    Rectangle(int l, int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        System.out.println("The area is: "+(l*b));
    }
    public void perimeter(){
        System.out.println("the circumference is: "+(2*(l+b)));
    }
}
public class XI {
    public static void main(String[] args) {
        boolean work=true;
        int op;
        while (work) {
            System.out.println("Enter whic object to create");
        }
    }
}
