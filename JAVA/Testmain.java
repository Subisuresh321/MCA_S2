class Test{
    int a,b;
    Test(int x,int y){
        a=x;
        b=y;
    }

    boolean equal (Test ob){
        if(ob.a==a && ob.b==b)
        return true;
        else
        return false;
    }
}
public class Testmain {
    public static void main(String[] args) {
        Test o1=new Test(10,20);
        Test o2=new Test(10,20);
        Test o3=new Test(1,5);
        System.out.println("o1==o2 "+o1.equal(o2));
        System.out.println("o1==o3 "+o1.equal(o3));
    }
    
}
