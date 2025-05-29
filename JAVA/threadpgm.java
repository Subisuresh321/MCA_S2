import java.util.*;

class Mul5 extends Thread {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("5 * "+i+" = "+(5*i));
        }
    }
}

class prime extends Thread{
    int n;
    public prime(int n){
        this.n=n;
    }
    boolean isprime(int num)
    {
        if(num<2) return false;
        for(int i=2;i<=num/2;i++)
        {
            if(num % i==0) return false;
        }
        return true;
    }

    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            if(isprime(i))
            System.out.println("Prime :"+i);
        }
    } 

}

public class threadpgm {
    public static void main(String[] args) {
        Mul5 m1=new Mul5();
        prime p1=new prime(20000);

        p1.start();
        m1.start();
        
    }
}

