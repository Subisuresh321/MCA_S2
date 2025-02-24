import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the number of Elements: ");
        size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=2;i<size;i++)
        {
            arr[i]=i;
        }
        System.out.println("Array is :");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Array  length is :"+arr.length);
    }
}
