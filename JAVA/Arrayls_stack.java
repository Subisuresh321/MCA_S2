import java.util.*;
public class Arrayls_stack {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<Integer>();
        System.out.println("Enter the size of Stack: ");
        int size=sc.nextInt();
        int top=0;
        while(true){
            int op;
            System.out.println("Enter an operation 1.Push 2.Pop 3.display 4.Exit: ");
            op=sc.nextInt();
            switch(op){
                case 1:
                    if(top==size)
                    System.out.println("Overflow");
                    else{
                    System.out.println("Enter the element to push");
                    int num=sc.nextInt();
                    list.add(top++,num);
                    }
                    break;
                case 2:
                    if(!list.isEmpty())
                    list.remove(--top);
                    else
                    System.out.println("UnderFlow");
                    break;
                case 3:
                    System.out.println("Stack elements are: " +list);
                    break;
                case 4:
                    sc.close();
                    return;
                default :
                        System.out.println("Invalid OP");
                        break;
                }
            }

        }



    }
