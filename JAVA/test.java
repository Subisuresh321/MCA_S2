class Matrix{
    int arr[][];
    Matrix(int arr[][]){
        this.arr=arr;
    }
}
public class test {
    static void mul(Matrix x,Matrix y){
        int res[][]=new int[x.arr.length][y.arr[0].length];
        for(int i=0;i<x.arr.length;i++)
            for(int j=0;j<x.arr[0].length;j++)
            {
                int sum=0;
                for(int k=0;k<x.arr[0].length;k++)
                sum+=x.arr[i][k]+y.arr[k][j];
                res[i][j]=sum;
            }
        for(int i=0;i<x.arr.length;i++){
            for(int j=0;j<x.arr[0].length;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        
    }
}
