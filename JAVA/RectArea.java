class CircArea{
    int r;
    CircArea(int x){
        r=x;
        System.out.println("This constructor");
    }
    void display(){
        double area=r*r*3.14;
        double peri=2*3.14*r;
        System.out.println("The Area & Perimeter"+area+" & "+peri);
    }
}
class RectArea{
    public static void main(String[] args) {
        CircArea obj=new CircArea(5);
        obj.display();
    }
}