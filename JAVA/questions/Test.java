import java.lang.String;

class Person{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
        
    }
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
public class Test {
    public static void main(String[] args) {
        Person p[]=new Person[3];
        //Intailizing objects
        p[0]=new Person("Subi",21);
        p[1]=new Person("athul",29);
        p[2]=new Person("soman",32);

        for(Person p1:p)
        {
            p1.display();
        }

    }
    
}
