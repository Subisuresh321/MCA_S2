package fileprograms;
import java.io.*;
import java.util.Scanner;
public class WriteRead {
    public static void main(String[] args) throws IOException{
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the filename: ");
        String filename=sc.nextLine();
        //writing
        FileOutputStream fos = new FileOutputStream(filename);
        
        System.out.println("Enter the text to insert: ");
        String text =sc.nextLine();

        fos.write(text.getBytes()); // getbytes() to covert to strings to byte[] as fos doesnt accept regular string
        fos.close();
        //read
        FileInputStream fis=new FileInputStream(filename);
        byte[] b= new byte[fis.available()];
        fis.read(b);
        fis.close();

        String fileContent= new String(b);
        System.out.println("The File content is: ");
        System.out.println(fileContent);
    }
}
