package fileprograms;

import java.io.File;

public class Checkfile {
 public static void main(String[] args) {
    String fname=args[0];
    File f = new File(fname);
    if(f.exists())
    {
        System.out.println(fname+" Exists");
        System.out.println("Absolute path: "+f.getPath());
        System.out.println("Size is  "+ f.length());
        System.out.println("Name is"+f.getName());
        System.out.println("Is readable: "+ f.canRead());
        System.out.println("Is writeable: "+ f.canWrite());
    }
    else
    System.out.println("File doesn't Exists");
 }   
}
