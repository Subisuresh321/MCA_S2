public class Exceptiontest {
    public static void main(String[] args) {
        try{
        System.out.println("start");
        int a=10, b=0;
        int c;
        c=a/b;
        }
        catch(Exception e){
            System.out.println("division by Zero is not possible!");

        }
    }
}
