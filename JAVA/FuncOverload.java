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
    void area(float l,float h)
    {
        System.out.println("The Area of Triangle is "+(0.5*l*h));
    }
}

public class FuncOverload {
    public static void main(String[] args) {
        Shape obj1=new Shape();
        obj1.area(5.0);
        obj1.area(5,6);
        obj1.area(10);
        float x=3,y=4;
        obj1.area(x,y);
}
}