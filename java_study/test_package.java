import Graphics.*;
import java.util.Scanner;
public class test_package {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r;
        System.out.println("Enter the radius of Circle: ");
        r=sc.nextInt();
        Graphics.Circle c1=new Circle(r);
        c1.area();

        int s;
        System.out.println("Enter the side of Square: ");
        s=sc.nextInt();
        Graphics.Square s1=new Square(s);
        s1.area();
        
    }
}
