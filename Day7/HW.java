//printing the sum of the diagonal elements in the given array:
//package Day7;
//import java.util.Scanner;
//public class HW{
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

//printing the second largest element in the array:

package Day7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        int second_larg;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                while(arr[i][j]>max){
                    max=arr[i][j];
                }
                    System.out.println(arr[i][j]+ " ");

            }
            System.out.println();
        }
//        System.out.println(max);
    }
}