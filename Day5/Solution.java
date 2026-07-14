//package Day5;
//
//public class Solution {
//}
//
//class Solution {
//    public int numWaterBottles(int numBottles, int exchange) {
//        int temp=0;
//       int exchange;
//        while(numBottles>0){
//            temp=numBottles/3;
//            numBottles=temp+0;
//            exchange++;
//        }
//
//    }
//}
//
//package Day5;
//
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int temp=0;
//        int exchange=0;
//        while(num>0){
//            temp=num/3;
//            num=temp+0;
//            exchange=exchange+1;
//        }
//        System.out.println(exchange);
//    }
//}


//Adding the sum of digits of even and odd
//package Day5;
//
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum=0;
//        int even_sum=0;
//        int odd_sum=0;
//        System.out.println("enter the number valur of entiere whole : ");
//        int n=sc.nextInt();
//        while(n!=0){
//            int pop=n%10;
//            if(pop%2==0){
//            even_sum+=pop;
//            }
//            else{
//                odd_sum+=pop;
//            }
//            sum+=pop;
//            n/=10;
//        }
//        System.out.println("sum of entiere whole : "+sum);
//        System.out.println("even entiere whole : "+even_sum);
//        System.out.println("odd entiere whole : "+odd_sum);
//    }
//}

//finding the maximum and minimum values from the given value.
//package Day5;
//import java.util.Scanner;
//public class Solution {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
//        int max_value=0;
//        int min_value=9;
//        while(num!=0){
//            int pop=num%10;
//            if(pop>max_value){
//                max_value=pop;
//            }
//            else if(pop<min_value){
//                min_value=pop;
//            }
//            num=num/10;
//        }
//        System.out.println("The Maximum value of the given number is : "+ max_value);
//        System.out.println("The Minimum value of the given number is : "+ min_value);
//    }
//}

//calculating the armstrong number
//package Day5;
//import java.util.Scanner;
//public class Solution {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
//        int org=num;
//        int sum=0;
//        while(num!=0){
//            int pop=num%10;
//            sum+=pop*pop*pop;
//            num=num/10;
//        }
//        if(sum==org){
//            System.out.println("Yes the given number is armstrong number");
//        }
//        else{
//            System.out.println("No the given number is not armstrong number");
//        }
//    }
//}
//package Day5;
//
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int origin=n;
//        int fact=1;
//        int sum=0;
//        while(n!=0){
//            int pop=n%10;
//            for(int i=1;i<=pop;i++){
//                fact=fact*i;
//            }
//            sum=sum+fact;
//            n=n/10;
//        }
//        System.out.println(sum);
//    }
//}

//fibonacci series:
//package Day5;
//import java.util.Scanner;
//public class Solution {
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(isStrong(n)){
//            System.out.println(n+ " is a strong number");
//        }
//        else{
//            System.out.println(n+ " is not a strong number");
//        }
//    }
//    public static boolean isStrong(int num)
//    {
//        int sum=0;
//        int temp=num;
//        while(num!=0)
//        {
//            int pop=num%10;
//            sum+=fact(pop);
//            num=num/10;
//        }
//        return sum==temp;
//    }
//    public static int fact(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        return fact;
//    }
//}
a=b;
b=c;