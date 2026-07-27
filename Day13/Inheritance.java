//Sample code for single inheritance:
//package Day13;
//class A{
//    void display(){
//        System.out.println("Display A");
//    }
//}
//class B extends A{
//    void show(){
//        System.out.println("Display B");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        A a=new A();
//        B b=new B();
//        a.display();
//        b.display();
//    }
//}

//Sample code for multi-level inheritance:
//package Day13;
//class A{
//    void display(){
//        System.out.println("Display A");
//    }
//}
//class B extends A{
//    void show(){
//        System.out.println("Display B");
//    }
//}
//class C extends A{
//    void sabari(){
//        System.out.println("Display C");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        A a=new A();
//        B b=new B();
//        C c=new C();
//        a.display();
//        b.show();
//        c.sabari();
//    }
//}

//Sample program for super inheritance:
//package Day13;
//class A{
//    A(){
//        super();
//        System.out.println("Enter the value of A ");
//    }
//    A(int a){
//        this();
//        System.out.println("Printing the value of A ");
//    }
//}
//class B extends A{
//    B(){
//
//    }
//    B(int a,int b){
//
//    }
//    B(int a){
//        this();
//        System.out.println("Printing the value of B ");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        B b=new B(10);
//    }
//}

//Sample program for overriding:
//package Day13;
//class car{
//    void station(){
//        System.out.println("Petrol Station ");
//    }
//}
//class EVcar extends car{
//    void station(){
//        System.out.println("EVcar Station ");
//    }
//}
//class Petrolcar extends car{
//    void station(){
//        System.out.println("Petrol Station ");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        car c=new car();
//        c.station();
//        EVcar ev=new EVcar();
//        ev.station();
//    }
//}

//Sample program for Overriding program type-2:
//package Day13;
//class animal{
//    void eat(){
//        System.out.println("Animal is eating");
//    }
//}
//class dog extends animal{
//    @Override
//    void eat(){
//        System.out.println("Dog is eating");
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        dog d = new dog();
//        d.eat();
//    }
//}