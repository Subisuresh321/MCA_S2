import java.util.Scanner;
class Matrix{
    int arr[][];
    Matrix(int arr[][]){
        this.arr= arr;
    }

    void isSym(){
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[0].length;j++)
                {
                    if(arr[i][j]!=arr[j][i])
                    {
                        System.out.println("The Matrix  is not a Symmetric Matrix");
                        return;
                    }
                }
        System.out.println("The matrix is Symmetric");
    }
}
public class IV {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns (both are equal)");
        int rc=sc.nextInt();
        int[][] matrix=new int[rc][rc];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rc;i++){
            for(int j=0;j<rc;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        Matrix m1=new Matrix(matrix);
        m1.isSym();
    }
}
