//Program for Encapsulation:
//package Day13;
//class A{
//    private String name;
//    private int a;
//    private int b;
//    A(String name,int a,int b){        //method 1 for accessing the private datatype:
//        this.a=a;
//        this.b=b;
//        this.name=name;
//    }
//    void setId(int a,int b){           //method 2 for accessing the private datatype:
//        this.a=a;
//        this.b=b;
//    }
//    int getA(){
//        return this.a;
//    }
//    int getB(){
//        return this.b;
//    }
//    void show(){                                  //assigning the values for private datatypes in method 1:
//        System.out.println(a+" "+b+" "+name);
//    }
//}
//public class Encapsulation {
//    public static void main(String[] args) {
//        A a1=new A("sabari",10,30);   //printing the values by method 1:
//        a1.show();                                //printing the values by method 1:
//        a1.setId(20,30);                    //assigning and printing the values by method 2:
//        System.out.println(a1.getA());            //printing the values by method 2:
//        System.out.println(a1.getB());            //printing the values by method 2:
//    }
//}


//Program for clg scenerio:
package Day13;
class student{
   public void display(){
       String name="Sabari";
       int id=202428;
       System.out.println("The Student name is : "+name);
       System.out.println("The Student ID is : "+id);
   }
}
class mentor extends student {
    private String name;
    private int id;
    void setId(String name,int id){
        this.name=name;
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
class hod extends mentor{
    private String name;
    private int id;
    void setId(String name,int id){
        this.name=name;
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    int getId(){
        return this.id;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
     student s=new student();
     s.display();
     mentor m=new mentor();
     m.setId("Agilesh",2346);
     System.out.println("The Mentor name is : "+m.getName());
     System.out.println("The Mentor ID is : "+m.getId());
     hod h=new hod();
     h.setId("Nithin",2345);
     System.out.println("The hod name is : "+h.getName());
     System.out.println("The hod ID is : "+h.getId());
    }
}