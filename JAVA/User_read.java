import java.util.Scanner;
class Shape{
    void area(double r){
        System.out.println("The Area of Circle is "+r*r*3.14);
    }
    void area(int l,int b)
    {
        System.out.println("The Area of Rectangle is "+l*b);
    }
    void area(int a){
        System.out.println("The Area of Square is "+a*a);
    }
    void area(float x,float y)
    {
        System.out.println("The Area of Triangle is "+(0.5*x*y));
    }
}

public class User_read {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape obj1=new Shape();
        System.out.println("Enter the radius: ");
        double r=sc.nextDouble();
        obj1.area(r);

        System.out.println("Enter the length and breadth ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        obj1.area(l,b);

        System.out.println("Enter the side of Square: ");
        int a=sc.nextInt();
        obj1.area(a);

        System.out.println("Enter the height and breadth ");
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        obj1.area(x,y);
}
}