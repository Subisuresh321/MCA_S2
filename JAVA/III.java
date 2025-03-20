class Complex{
    int real;
    int img;
    Complex(int real, int img){
        this.real=real;
        this.img=img;
    }
}
public class III {
    public static void main(String[] args) {
     Complex c1=new Complex(25, 35);   
     Complex c2=new Complex(5, 45); 
     System.out.println("the sum is: "+(c1.real+c2.real)+"+"+(c1.img+c2.img)+" i");
    }
}
