import java.util.ArrayList;
import java.util.Scanner;

class Stack<T> {
    ArrayList<T> A;
    int size, top = -1;

    Stack(int size) {
        this.size = size;
        A = new ArrayList<>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            A.add(X);
        }
    }

    void pop() {
        if (empty()) {
            System.out.println("Stack Underflow");
        } else {
            A.remove(top);
            top--;
        }
    }

    T top() {
        if (empty()) {
            return null;
        } else
            return A.get(top);
    }

    boolean empty() {
        return top == -1;
    }
    void display(){
        System.out.println(A);
    }
    public String toString() {
        if (!A.isEmpty()) {
            String ans = "";
            for (int i = 0; i < top; i++) {
                ans += String.valueOf(A.get(i)) + "->";
            }
            ans += String.valueOf(A.get(top));
            return ans;
        }
        else
        return "";

    }
}

public class generic_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack: ");
        int size = sc.nextInt();
        Stack<Integer> s = new Stack<>(size);
        while (true) {
            int op;
            System.out.println("Select an option 1.Push 2.Pop 3. display 4.Top 5.Exit: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int n = sc.nextInt();
                    s.push(n);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    System.out.println("The elements of stack are: ");
                    s.display();
                    break;
                case 4:
                    System.out.println("Top is: " + s.top());
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid operation!!!");
                    break;
            }
        }
    }
}
