
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class filepgm2 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String fname=sc.nextLine();
        FileOutputStream fos= new FileOutputStream(fname);
        System.out.println("Enter the contents to write: ");
        String wcont= sc.nextLine();
        fos.write(wcont.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream(fname);
        byte[] b= new byte[fis.available()];
        fis.read(b);
        String rcont=new String(b);
        System.out.println("The file content is: ");
        System.out.println(rcont);
    }
}
