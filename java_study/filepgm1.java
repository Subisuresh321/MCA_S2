import java.io.File;
import java.util.Scanner;

public class filepgm1 {
    static void ls(File dir) {
        File[] subfiles = dir.listFiles();
        if (subfiles != null) {
            for (File x : subfiles) {
                System.out.println("-"+x.getName());`
                if(x.isDirectory())
                ls(x);
            }
        }
    }
    static void search(File dir,String name){
        File[] subfiles=dir.listFiles();
        if(subfiles !=null)
        {
           for(File x:subfiles)
           {
            if(x.isFile() && x.getName().equals(name))
            {
                System.out.println("The file found at: "+x.getAbsolutePath());
                return;
            }
            else if(x.isDirectory())
            {
                search(x, name);
            }
           } 
        }
        System.out.println("The file "+name+" not found inside"+dir);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dpath;
        System.out.println("Enter the directory path: ");
        dpath=sc.nextLine();
        File directory= new File(dpath);
        if(directory.exists())
        {
            System.out.println("The files in directory "+directory.getName()+" are:");
            ls(directory);

            System.out.println("Enter a file name to search: ");
            String fname=sc.nextLine();
            search(directory, fname);
        }
        else
        System.out.println("Invalid path!!!");
    }
}
