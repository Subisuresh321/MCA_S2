public class ArthExcp {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try
        {
            if(b==0)
            throw new ArithmeticException("Division by sorry not walk (nadakilla)");
            else
            System.out.println("The result is "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
