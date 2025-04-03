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
        Scanner sc=new Scanner(System.in);
        int op;
        Shape obj=null;
        while (true) {
            System.out.println("Enter which object to create 1.Circle 2.Rectangle 3.Exit: ");
            op=sc.nextInt();
            if(op==1){
                int r;
                System.out.println("Enter the radius: ");
                r=sc.nextInt();
                obj=new Circle(r);
            }
            else if(op==2){
                int l,b;
                System.out.println("Enter the len and breadth: ");
                l=sc.nextInt(); 
                b=sc.nextInt(); 
                obj=new Rectangle(l,b);
            } else if (op == 3) {
                break;
            } else {
                System.out.println("Invalid option, please try again.");
                continue;
            }


            System.out.println("Enter what to find 1.Area 2.Perimeter 3.Exit: ");
            op=sc.nextInt();
            
            if(op==1){
                obj.area();
            }
            else if(op==2){
               obj.perimeter();
            }
            else if (op == 3) {
                break;
            } else {
                System.out.println("Invalid option, please try again.");
                continue;
            }
        }
    }
}
