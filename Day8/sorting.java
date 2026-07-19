//Problem for bubble sort
//package Day8;
//import  java.util.Scanner;
//public class sorting {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(arr[i]>arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for(int num:arr){
//            System.out.println(num);
//        }
//    }
//}

//program for selection sort:
package Day8;
import java.util.Scanner;
public  class sorting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }
            for(int num:arr){
                System.out.print(num+" ");
            }

    }
}