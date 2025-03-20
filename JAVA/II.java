class Matrix {
    int arr[][];

    Matrix(int arr[][]) {
        this.arr = arr;
    }
}

public class II {
    static void add(Matrix x, Matrix y) {
        int rows = x.arr.length;
        int cols = y.arr[0].length;
        int res[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                res[i][j] = x.arr[i][j] + y.arr[i][j];
            }
        System.out.println("The Matrix Addition is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void mul(Matrix x,Matrix y){
        if(x.arr[0].length!=y.arr.length)
        {
            System.out.println("Multiplication not possible");
            return;
        }
        int rows = x.arr.length;
        int cols = y.arr[0].length;
        int res[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                x.arr[i][j] + y.arr[i][j];
            }
        System.out.println("The Matrix Addition is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix1[][]= new int[][]{{1,2},{3,4}};
        int matrix2[][]= new int[][]{{6,7},{8,9}};
        Matrix m1=new Matrix(matrix1);
        Matrix m2=new Matrix(matrix2);
        add(m1,m2);
    }
}
