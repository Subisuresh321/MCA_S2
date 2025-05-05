package Graphics;

public class Square implements Figure{
    int l;

    public Square(int l){
        this.l=l;
    }

    public void area(){
        System.out.println("The area of Square is : "+(l*l));
    }
}
