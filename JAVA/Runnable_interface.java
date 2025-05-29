import java.util.Scanner;
class Fibo implements Runnable
{
    int limit;
    Fibo(int limit){
        this.limit=limit;
    }

    public void run()
    {
        int f1=0,f2=1,f3=0;
        for(int i=0;i<limit;i++)
        {
            f3=f1+f2;
            System.out.println(Thread.currentThread().getName()+f1);
            f1=f2;
            f2=f3;
        }
    }
}

class Even implements Runnable
{
    int start,end;
    Even(int s,int e){
        start=s;
        end=e;
    }
    public void run(){
        for(int i=start;i<=end;i++)
        {
            if(i % 2==0)
            System.out.println("Even: "+i);
        }
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        Fibo f1=new Fibo(7);
        Even e1=new Even(10, 40);
        Thread t1=new Thread(f1);
        Thread t2=new Thread(e1);
        t1.start();
        t2.start();
    }
}
