import java.util.Scanner;
class Product{
    String pname;
    int pcode;
    int price;
    Product (String x,int y,int z){
        pname=x;
        pcode=y;
        price=z;
    }
}
public class I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product obj[]=new Product[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the Product name: ");
            String name=sc.next();
            System.out.println("Enter the Product code: ");
            int code=sc.nextInt();
            System.out.println("Enter the Product price: ");
            int price=sc.nextInt();
            obj[i]=new Product(name, code, price);
        }
        int min=Integer.MAX_VALUE;
        int res=-1;
        for(int i=0;i<3;i++){
            if(obj[i].price<min){
                min=obj[i].price;
                res=i;
            }
        }
        System.out.println("The Product with least Price: ");
        System.out.println(obj[res].pname);
        System.out.println(obj[res].pcode);
        System.out.println(obj[res].price);
    }
    
}
