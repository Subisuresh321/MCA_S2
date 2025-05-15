import java.util.Scanner;
class NegativeException extends RuntimeException{
    NegativeException(String s)
    {
        super(s);
    }
}
public class excp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,n,sum=0;
        System.out.println("Enter the no of numbers: ");
        num=sc.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<num;i++)
        {
            n=sc.nextInt();
            try{
                if(n<0)
                throw new NegativeException("Only postive numbers!!");
                else
                sum+=n;
            }
            catch(NegativeException e)
            {
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("The average is "+(sum/num));

    }
}
