package Day14;
interface A{
    void a();
}
interface C extends A{
    void display();
//        System.out.println("B");

}
class B implements C {
    public void a(){
        System.out.println("C");
    }
    public void display(){
        System.out.println("B");
    }
}
public class Interface {
    public static void main(String[] args) {
        A a = new B();
        C a1=new B();
        a1.a();
    }
}
