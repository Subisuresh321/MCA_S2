class Animal{
    String color="black";
}
class Animal2 extends Animal{
    String color="red";
    void displayColor(){
        System.out.println("color of parent class"+super.color);
        System.out.println(color);
    }
}
public class Animalmain {
    public static void main(String[] args) {
        Animal2 monkey=new Animal2();
        monkey.displayColor();
    }
}
