//Printing the employee's salary details using abstraction:
//package Day14;
//import java.util.Scanner;
//abstract class employee{
//    protected String name;
//    protected int id;
//    protected double base_salary;
//    employee(String name, int id, double base_salary){
//        this.name = name;
//        this.id = id;
//        this.base_salary = base_salary;
//    }
//    void display(){
//        System.out.println("Name: " + name);
//        System.out.println("ID: " + id);
//    }
//    abstract void bonus();
//}
//class manager extends employee{
//    manager(String name, int id, double base_salary){
//        super(name, id, base_salary);
//    }
//    void bonus(){
//        System.out.println("Manager Name: " + name);
//        System.out.println("Manager ID: " + id);
//        System.out.println("Manager Bonus Salary : "+base_salary*0.5);
//
//    }
//}
//class developer extends employee{
//    developer(String name, int id, double base_salary){
//        super(name, id, base_salary);
//    }
//    void bonus(){
//        System.out.println("Developer Name: " + name);
//        System.out.println("Developer ID: " + id);
//        System.out.println("Developer Bonus Salary: "+base_salary*0.2);
//    }
//}
//class intern extends employee{
//    intern(String name, int id, double base_salary){
//        super(name, id, base_salary);
//    }
//    void bonus() {
//        System.out.println("Intern Name: " + name);
//        System.out.println("Intern ID: " + id);
//        System.out.println("Intern Salary: " + base_salary);
//    }
//}
//public class company {
//    public static void main(String[] args) {
//        employee e=new manager("Sabari",2024,10000);
//        employee d=new developer("Agilesh",2026,20000);
//        employee i=new intern("Nithin",2028,5000);
//        e.bonus();
//        d.bonus();
//        i.bonus();
//    }
//}
