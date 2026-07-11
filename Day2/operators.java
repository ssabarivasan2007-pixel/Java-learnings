//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);{
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            int c=a+b;
//            System.out.println("Addition of a & b is : "+ c);
//            c=0;
//            c=a-b;
//            System.out.println("Subtraction of a & b is :"+ c);
//            c=0;
//            c=a*b;
//            System.out.println("Multiplication of a & b is :"+ c);
//            c=0;
//            c=a/b;
//            System.out.println("Divsion of a & b is :"+ c);
//            c=0;
//            c=a%b;
//            System.out.println("Modulo of a & b is :"+ c);
//            System.out.println("Increment of a is : "+ (++a));
//            a--;
//            System.out.println("Decrement of a is : "+ (--a));
//            System.out.println("Increment of b is : "+ (++b));
//            b--;
//            System.out.println("Decrement of b is : "+ (--b));
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            System.out.println(a>b);
//            System.out.println(a<b);
//            System.out.println(a==b);
//            System.out.println(a!=b);
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a&b);
//            System.out.println(a|b);
//            System.out.println(a^b);
//            System.out.println(a<<b);
//            System.out.println(a>>b);
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int hrs=sc.nextInt();
//            int scs;
//            scs=hrs*3600;
//            System.out.println(scs);
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int day_salary=sc.nextInt();
//            int month_salary;
//            int year_salary;
//            month_salary=day_salary*31;
//            year_salary=month_salary*12;
//            System.out.println("The Month Salary is : "+ month_salary);
//            System.out.println("The Year Salary is : "+ year_salary);
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int celsius=sc.nextInt();
//            int fahrein_height;
//            fahrein_height=(celsius*9/5)+32;
//            System.out.println("The Temperature is : "+ fahrein_height);
//        }
//    }
//}
//package Day2;
//import java.util.*;
//public class operators{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);{
//            int cible=sc.nextInt();
//            int loan_amount=sc.nextInt();
//            System.out.println(cible>750&&loan_amount>100000);
//        }
//    }
//}
package Day2;
import java.util.*;
public class operators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);{
          float eng=sc.nextFloat();
          float tam=sc.nextFloat();
          float sci=sc.nextFloat();
          float soc=sc.nextFloat();
          float maths=sc.nextFloat();
          float total=(eng+tam+sci+soc+maths);
          float avg=total/5;
          System.out.println(avg);
        }
    }
}