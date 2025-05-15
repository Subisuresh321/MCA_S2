package java_study;

import java.io.*;
import java.util.Scanner;
class Product{
    int pcode,price;
    String pname;
    Product(int pcode,String pname,int price){
       this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
}
public class pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] objProducts = new Product[3];
        for(int i=0;i<3;i++)
        {
            int x,z;
            String y;
            System.out.println("Enter the pcode of product "+(i+1)+": ");
            x=sc.nextInt();
            System.out.println("Enter the pnameof product "+(i+1)+": ");
            y=sc.next();
            System.out.println("Enter the priceof product "+(i+1)+": ");
            z=sc.nextInt();
            objProducts[i]= new Product(x, y, z);
        }
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<3;i++)
        {
            if(objProducts[i].price<min){
                min=objProducts[i].price;
                minIndex=i;
            }
        }

        System.out.println("The Product "+objProducts[minIndex].pname+" has the lowest price "+objProducts[minIndex].price);
    }
}
