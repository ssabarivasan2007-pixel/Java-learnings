//printing the square shaped
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the left aligned triangle (right angle)
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the downside left alinged triangle.
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=n;j>=i;j--){
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the right alinged triangle:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            for(int s=0;s<=n-i;s++) {
//                System.out.print(" ");
//            }
//                for (int j = 1; j<=i; j++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//        }
//    }
//}

//printing the hollow square:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for (int j = 1; j<=n; j++) {
//                if(i==1||j==1||i==n||j==n) {
//                    System.out.print(" *");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the pyramid pattern:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            for(int s=1;s<=n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//printing the inverse pyramid:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=n;i>0;i--){
//            for(int s=1;s<=n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//printing the diamond pattern:

//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            for(int s=1;s<=n-i;s++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=0;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//printing the solid square with alphabets:
// package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        char ch='a';
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println(" ");
//        }
//    }
//}


//printing the number triangle pattern:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" "+j);
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the binary triangle shape:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if((i+j)%2==0) {
//                    System.out.print(1);
//                }
//                else{
//                    System.out.print(0);
//                }
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the tables in the solid square shape:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.printf("%4d",i*j);
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the zigzag numbers:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            int num_count=i;
//            for(int j=1;j<=i;j++){
//                System.out.print(num_count+" ");
//                num_count=num_count + 5 - j;
//            }
//            System.out.println(" ");
//        }
//    }
//}

//printing the solid square in zigzag numbers:
//package Day6;
//import java.util.Scanner;
//public class patterns {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            int num_count=i;
//            for(int j=1;j<=n;j++){
//                System.out.print(num_count+" ");
//                num_count=num_count + 5 - j;
//            }
//            System.out.println(" ");
//        }
//    }
//}