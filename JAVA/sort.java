import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[i]=arr[i]^arr[j];
                    arr[j]=arr[i]^arr[j];
                    arr[i]=arr[i]^arr[j];
                }
            }
        System.out.println("The Sorted List is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            
        }
    }
}
