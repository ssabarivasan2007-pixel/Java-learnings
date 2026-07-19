//program for searching element in the given array:
//package Day8;
//import java.util.Scanner;
//public class searching {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int target = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(linear_s(arr, target));
//    }
//    static int linear_s(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}

//finding the targeted char in the given string
//package Day8;
//import java.util.Scanner;
//public class searching{
//    public  static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String names="nithin jai";
//        char[] name=names.toCharArray();
//        char target='t';
//        if(ls(name,target)){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }
//    }
//    public static boolean ls(char[] name,char target){
//        for(char ch:name){
//            if(ch==target){
//                return true;
//            }
//        }
//        return false;
//    }
//}

//printing the target element in 2D array:
//package Day8;
//public class searching {
//    public static void main(String[] args){
//        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
//        int t=9;
//        if(ls(a,t)){
//            System.out.println("found");
//        }
//        else {
//            System.out.println("not found");
//        }
//    }
//    public static boolean ls(int [][] arr,int teg){
//        for (int i=0; i< arr.length;i++){
//            for (int j=0;j< arr.length;j++){
//                if(teg==arr[i][j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

//printing the maximum and minimum value of the given 2D array:

package Day8;

import java.util.Scanner;

public class searching{
    public  static void main(String args[]){
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
        int min=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    continue;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The maximum value of the given matrix is : "+max);
        System.out.println("The minimum value of the given matrix is : "+min);
    }
}