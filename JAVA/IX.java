import java.util.Scanner;
public class IX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] strs=new String[5];
        for(int i=0;i<strs.length;i++){
            System.out.println("Enter a String: ");
            strs[i]=sc.next();
        }
        for(int i=0;i<strs.length-1;i++)
        {
            for(int j=i+1;j<strs.length;j++){
                String temp;
                if(strs[i].compareTo(strs[j])>1)
                {
                    temp=strs[i];
                    strs[i]=strs[j];
                    strs[j]=temp;
                }
            }
        }
        System.out.println("Sorted Strings: ");
        for(String str:strs){
            System.out.println(str);
        }
    }
}
