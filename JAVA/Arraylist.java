import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList <String> list= new ArrayList<String>(); // if the type is unknown  put <T>
        // for(int i=0;i<5;i++){
        //     System.out.println("Enter the string: ");
        //     String str=sc.nextLine();
        //     list.add(str);
        // }
        list.add("subi");
        list.add("diya");
        list.add("Bigil");
        list.add("leo");
        list.add("jobin");
        list.add("pinku");
        list.add("amala");
        list.add("surabhi");
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.indexOf("diya"));
        System.out.println(list.contains("jobin"));
        System.out.println(list.contains("jacob"));
        list.set(3, "parthiban");
        System.out.println(list);
        list.remove("pinku");
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
