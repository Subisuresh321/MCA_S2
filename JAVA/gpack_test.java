import Graphics.*;
import java.util.Scanner;
public class gpack_test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int r;
        System.out.println("Enter the radius of circle: ");
        r=sc.nextInt();
        Graphics.Circle cir = new Graphics.Circle(r);
        cir.area();

        int l,b;
        System.out.println("Enter the lenght and breadth for Rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        Graphics.Rectangle rec= new Rectangle(l, b);
        rec.area();

        int s;
        System.out.println("Enter the lenght for Square: ");
        s=sc.nextInt();
        Graphics.Square sq = new Square(s); 
        sq.area();
    }
}
