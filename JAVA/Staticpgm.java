class Staticclass{
    static int c;
    static void count(){
        c++;
    }
    static void display(){
        System.out.println(c);
    }
}
public class Staticpgm {
    public static void main(String[] args) {
        Staticclass.c=0;
        Staticclass.display();
        Staticclass.count();
        Staticclass.count();
        Staticclass.display();
    }
}
