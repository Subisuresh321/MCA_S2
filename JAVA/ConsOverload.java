class Shape{
    Shape(int r){
        System.out.println("The Area of Circle is "+r*r*3.14);
    }
    Shape(int l, int b){
        System.out.println("The Area of rectangle is "+l*b);
    }
}
public class ConsOverload {
    public static void main(String[] args) {
        Shape cir=new Shape(5);
        Shape rect=new Shape(5,6);
    }
}
