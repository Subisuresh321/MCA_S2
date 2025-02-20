import java.util.Scanner;
public class User_read {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a=input.nextInt();
        System.out.println("Enter an float: ");
        float b=input.nextFloat();
        System.out.println("The Integer is "+a+" Float is "+b);
    }
}

