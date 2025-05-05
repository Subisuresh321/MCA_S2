package Graphics;

public class Rectangle implements Figure {
    int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){    
        System.out.println("The area of Rectangle is : "+(l*b));
    }
}
