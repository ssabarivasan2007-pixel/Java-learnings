//declaring and initializing the array:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] age=new int[5];
//        String[] name=new String[7];
//        float[] height=new float[5];
//        int [] weight={90,85,58,75,80};
//        for(int i=0;i<7;i++){
//            name[i]=sc.nextLine();
//        }
//        for(String name1:name){         //enhanced for loop.
//            System.out.print(name1+" ");
//        }
//    }
//}
//
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] age=new int[5];
//        String[] name=new String[7];
//        float[] height=new float[5];
//        int [] weight={90,85,58,75,80};
//        for(int i=0;i<7;i++){
//            name[i]=sc.nextLine();
//        }
//        for(String name1:name){
//            System.out.print(name1+" ");
//        }
//    }
//}


//printing the average and the length of the given array:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of the array");
//        int size=sc.nextInt();
//        int sum=0;
//        int [] id=new int [size];
//        int length=id.length;
//        for(int i=0;i<size;i++){
//            id[i]=sc.nextInt();
//        }
//        for(int num:id){
//            sum+=num;
//        }
//        float avg=(float)sum/length;
//        System.out.println("The average of the array is "+avg);
//        System.out.println("The length of the array is "+length);
//        System.out.println("The sum of the array is "+sum);
//    }
//}

//printing the maximum and minimum value of the given array:
//package Day7;
//import java.util.Scanner;
//public class arrays{
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array");
//        int n=sc.nextInt();
//        int [] a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        int max=a[0];
//        int min=a[0];
//        for(int all : a){       //Enhanced for loop
//            if(all>max){
//                max=all;
//            }
//            else if(all<min){
//                min=all;
//            }
//        }
//        System.out.println("Maximum number is "+max);
//        System.out.println("Minimum number is "+min);
//    }
//}

//swapping the first and last digit of the given array
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int swap=0;swap<n;swap++) {
//            int first_digit = arr[0];
//            int last_digit = arr[n - 1];
//             int temp = first_digit;
//            first_digit = last_digit;
//            last_digit = temp;
//        }
//        for(int all:arr){
//            System.out.print(all+" ");
//        }
////        System.out.println(first_digit);
////        System.out.println(last_digit);
//    }
//}

//printing the even sum and odd sum of the given array:

//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        int even_sum=0;
//        int odd_sum=0;
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            if(arr[i]%2==0){
//                even_sum+=arr[i];
//            }
//            else{
//                odd_sum+=arr[i];
//            }
//            System.out.println("The Array is : "+arr[i]);
//        }
//        System.out.println("The sum of the even numbers is : "+even_sum);
//        System.out.println("The sum of the even numbers is : "+odd_sum);
//    }
//}

//printing the even digit sum and odd digit sum:

//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        int even_sum=0;
//        int odd_sum=0;
//        int length=arr.length;
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//          if(length%2==0){
//              if(arr[i]%2==0){
//                  even_sum+=arr[i];
//              }
//              else{
//                  continue;
//              }
//          } else if (length%2!=0) {
//              if (arr[i]%2!=0){
//                  odd_sum+=arr[i];
//              }
//          }
////            System.out.println("The Array is : "+arr[i]);
//        }
//        System.out.println("The sum of the even numbers is : "+even_sum);
//        System.out.println("The sum of the odd numbers is : "+odd_sum);
//    }
//}

//printing the sum of odd index and even index numbers in the given array:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        int even_sum=0;
//        int odd_sum=0;
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int num:arr){
//            int org=num;
//            int count=0;
//            while(num!=0){
//                int pop=num%10;
//                count++;
//                num=num/10;
//            }
//            if(count%2==0){
//                even_sum+=org;
//            }
//            else{
//                odd_sum+=org;
//            }
//        }
//        System.out.println(even_sum);
//        System.out.println(odd_sum);
//    }
//}

//printing the sum of the even numbers present in the array if the sum of the element is even means add to even_sum else add it in odd sum:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        int even_sum=0;
//        int odd_sum=0;
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int num:arr){
//            int org=num;
//            int count=0;
//            while(num!=0){
//                int pop=num%10;
//                count+=pop;
//                num=num/10;
//            }
//            if(count%2==0){
//                even_sum+=org;
//            }
//            else{
//                odd_sum+=org;
//            }
//        }
//        System.out.println(even_sum);
//        System.out.println(odd_sum);
//    }
//}

//pinting the addition of 2d arrays:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the rows of the array");
//        int rows=sc.nextInt();
//        System.out.println("enter the columns of the array");
//        int cols=sc.nextInt();
//        int [][] a=new int[rows][cols];
//        int [][] b=new int[rows][cols];
//        int [][] c=new int[rows][cols];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                a[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                b[i][j]=sc.nextInt();
//            }
//        }
//        for(int j=0;j<cols;j++){
//            for(int i=0;i<rows;i++){
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//            System.out.println();
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                c[i][j]=a[i][j]+b[i][j];
//            }
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                System.out.print(c[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//printing the sum of the diagonal elements in the given array:
//package Day7;
//import java.util.Scanner;
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int rows=sc.nextInt();
//        int cols=sc.nextInt();
//        int [][] arr1= new int[rows][cols];
//        int sum=0;
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                arr1[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<cols;j++){
//                if(arr1[i]==arr1[j]){
//                    sum=sum+arr1[i][j];
//                }
//            }
//        }
//        System.out.println("The sum of the diagonal element is : "+ sum);
//    }
//}