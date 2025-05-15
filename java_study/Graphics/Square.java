package Graphics;

public class Square implements Figure{
    int s;
    public Square(int s)
    {
        this.s=s;
    }
    public void area()
    {
        System.out.println("The area of Square is: "+(s*s));
    }
}