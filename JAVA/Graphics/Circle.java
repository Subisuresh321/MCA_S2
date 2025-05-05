package Graphics;

public class Circle implements Figure {
    int r;
    public Circle(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("The area of Circle is : "+ (3.14*r*r));
    }
}
