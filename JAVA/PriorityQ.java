import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue <Integer> pq= new PriorityQueue<Integer>();
        int op,num;
        while(true)
        {
            System.out.println("Enter an option\n----------------\n1.Add\n2.Remove\n3.Display\n4.Peek\n5.Poll\n6.Exit\n");
            op=sc.nextInt();
            switch(op){
                case 1:
                System.out.println("Enter the element to insert: ");
                num=sc.nextInt();
                pq.add(num);
                break;
                case 2:
                if(!pq.isEmpty())
                pq.remove();
                else
                System.out.println("Queue empty!!!");
                break;
                case 3:
                System.out.println("The list is: "+pq);
                break;
                case 4:
                System.out.println("the head is: "+pq.peek());
                break;
                case 5:
                if(!pq.isEmpty())
                {
                num=pq.poll();
                System.out.println("Removed head: "+num);
                }
                else
                System.out.println("Queue is empty!!!");
                break;
                case 6:
                System.exit(0);
                default:
                System.out.println("Invalid option!!!");
            }
        }
    }
}
