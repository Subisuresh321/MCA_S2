
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class filecpy {
    public static void main(String[] args) throws IOException {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the filename");
            String filename=sc.nextLine();
        //from file
        FileInputStream fis= new FileInputStream(filename);
        byte[] b = new byte[fis.available()];
        fis.read(b);
        fis.close();

        //into file
        
        System.out.println("Enter the filename");
        String filename2=sc.nextLine();
        FileOutputStream fos =new FileOutputStream(filename2);
        fos.write(b);
        fos.close();
    }
}
