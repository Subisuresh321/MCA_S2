import java.util.Scanner;
class StringOp{
    String str;
    StringOp(String str){
        this.str=str;
    }

    void getUpper(){
        System.out.println("The uppercase is: "+str.toUpperCase());
    }
    void getLower(){
        System.out.println("The lowercase is: "+str.toLowerCase());
    }
    void getLength(){
        System.out.println("The length of string is: "+str.length());
    }
    void getSub(){
        for(int i=0;i<str.length();i++)
        System.out.println(str.substring(i)); 
    }
    void getOcc(char c){
        System.out.println("The first Occurence is at: "+str.indexOf(c));
    }
}
public class VI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.next();
        StringOp s1=new StringOp(str);
        s1.getUpper();
        s1.getLower();
        System.out.println("Enter the char to find first occurence: ");
        char c=sc.next().charAt(0);
        s1.getOcc(c);
        s1.getLength();
        s1.getSub();
    }
}
