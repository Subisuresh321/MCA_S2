import java.util.Scanner;
public class V {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter the numbers of elements in array: ");
        int m=sc.nextInt();
        int[] arr=new int[m];
        System.out.println("Enter the elements: ");
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search: ");
        int k=sc.nextInt();

        for(int i=0;i<m;i++)
        {
            if(arr[i]==k)
            {
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Element found");
        }
        else
        System.out.println("Element not found");
    }
}
