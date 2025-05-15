import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkedHS {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        Set<Integer> st=new LinkedHashSet<>();
        int op,num;
        while (true) {
            System.out.println("-----------------\n1.Add\n2.Remove\n3.Display\n4.Search\n5.Clear\n-----------------\nEnter an option: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the element to insert: ");
                    num=sc.nextInt();
                    st.add(num);
                    break;
                case 2:
                    if(!st.isEmpty())
                    {
                        System.out.println("Enter the element to remove: ");
                        num=sc.nextInt();
                        st.remove(num);
                    }
                    break;
                case 3:
                    System.out.println("the list is: "+st);
                    break;
                case 4:
                    if(!st.isEmpty())
                    {
                        System.out.println("Enter the element to search: ");
                        num=sc.nextInt();
                        System.out.println("List contains "+num+" : "+st.contains(num));
                    }
                    break;
                case 5:
                    st.clear();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid op");
                    break;
            }

        }
    }
}
