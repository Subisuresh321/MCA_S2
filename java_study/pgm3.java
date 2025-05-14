package java_study;
import java.util.Scanner;
class Complex{
    int real;
    int img;
    Complex(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part: ");
        real=sc.nextInt();
        System.out.println("Enter the Imaginary Part: ");
        img=sc.nextInt();
    }

    void add(Complex c2)
    {
        System.out.println("The sum is "+(this.real+c2.real)+"+"+(this.img+c2.img)+"i");
    }
}
public class pgm3 {
    public static void main(String[] args) {
        Complex c1=new Complex();
        Complex c2=new Complex();
        c1.add(c2);
    }
}
