class parent{
    parent(){
    System.out.println("This is parent class");
    }
}
class child extends parent {
    child(){
    System.out.println("This is child class");
    }

    public static void main(String[] args) {
        child obj=new child();
    }
}
