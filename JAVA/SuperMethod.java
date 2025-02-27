class Rect
{
    int l,b;
    Rect(int x,int y){
        l=x;
        b=y;
    }
    void area(){
        System.out.println("Area: "+l*b);
    }
    
}
class cube extends Rect{
    int h;
    cube(int m,int n,int z){
        super(m, n); // to call super constructor
        h=z;
        System.out.println(h);
    }
    void vol(){
        System.out.println("Volume: "+l*b*h);
    }
    
}
public class SuperMethod {
    public static void main(String[] args) {
        cube c1=new cube(5,2,3);
        c1.area();
        c1.vol();
    }
}
