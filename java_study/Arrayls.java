import java.util.ArrayList;
import java.util.Scanner;

public class Arrayls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> s= new ArrayList<>();
        int op;
        int i;
        String str;
        while(true){
             System.out.print("\n----------------\n1: add\n2: size\n3: search by index\n4: find index\n5: contains\n6: remove\n7: remove by index\n8: display\n9: clear search\n0:Exit\n----------------\nEnter your choice: "); 
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the string to add: ");
                    str=sc.nextLine();
                    s.add(str);
                    break;
                case 2:
                    System.out.println("The size of list is: "+s.size());
                    break;
                case 3:
                    System.out.println("Enter the index to search: ");
                    i=sc.nextInt();
                    System.out.println("The element at "+i+" is: "+s.get(i));
                    break;
                case 4:
                    System.out.println("Enter the element to find index: ");
                    str=sc.nextLine();
                    System.out.println("The index of "+str+" is: "+s.indexOf(str));
                    break;
                case 5:
                    System.out.println("Enter the element to check whether it exist in list: ");
                    str=sc.nextLine();
                    System.out.println("list contains "+str+" : "+s.contains(str));
                    break;
                case 6:
                    System.out.println("Enter the element to remove from list: ");
                    str=sc.nextLine();
                    s.remove(str);
                    break;
                case 7:
                    System.out.println("Enter the index of element to remove: ");
                    i=sc.nextInt();
                    s.remove(i);
                    break;
                case 8:
                    System.out.println("List: "+s);
                    break;
                case 9:
                    s.clear();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option!!!");
                    break;
            }

        }
    }
}
