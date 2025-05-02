package testpackage;

 class test {
     protected void show(){
        System.out.println("Hello");
     }
}
public class abc extends test{
    public static void main(String[] args) {
         test obj = new test();
         obj.show();
    }
}
