import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class evenoroddfile  {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the filename: ");
        String inputFile=reader.readLine();
        System.out.println("enter the evenfilename: ");
        String evenFile=reader.readLine();
        System.out.println("enter the oddfilename: ");
        String oddFile=reader.readLine();

        BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFile));
        BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFile));
        String line;
        while(( line=inputReader.readLine())!=null )
        {
            int num=Integer.parseInt(line);
            if(num%2==0)
            {
                evenWriter.write(line);
                evenWriter.newLine();
            }
            else
            {
                oddWriter.write(line);
                oddWriter.newLine();
            }
        }
        oddWriter.close();
        evenWriter.close();
        inputReader.close();
        reader.close();
    }
}
