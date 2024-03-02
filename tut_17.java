// import java.util.Scanner;

// public class tut_17 { 
//     public static void printNumb(int n){
//         if(n==0)
//         {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the no.: ");
//         int n=sc.nextInt();
//         // int n=5;

//         // tut_17 t=new tut_17();
//         printNumb(n);

//     }
// }




//Print numbers from 1 to 5 

// public class tut_17 { 
//     public static void printNumb(int n){
//         if(n==6)
//         {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String[] args) {
//         int n =1;
       
//         printNumb(n);

//     }
// }


// Print sum of first n natural numbers

// public class tut_17{
//     public static void printSum(int i, int n, int sum){ 
//         if(i==n)
//         {
//             sum+=i; 
//             System.out.println(sum  );
//             return ;
//         }

//         sum+=i;
//         printSum(i+1,n,sum);
//         System.out.println(i);
//         }
        
    
//     public static void main(String[] args) {
//         // Scanner sc= new Scanner(System.in);
//         // int n=sc.nextInt();
//         printSum(1,5,0);
//     }
// }

// import java.util.Scanner;
// public class tut_17 {
//     public static void printNum(int n)
//     {
//         if(n==0)
//         {
//             return;
//         }
//         System.out.println(n);
//         printNum(n-1);
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n=sc.nextInt();

//         printNum(n);
//     }
// }

// public class tut_17 {
//     public static void printNum(int n)
//     {
//         if(n==6)
//         {
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);
//     }

//     public static void main(String[] args) {
//         // Scanner sc= new Scanner(System.in);
//         // System.out.println("Enter n: ");
//         // int n=sc.nextInt();

//         int n=1;
//         printNum(n);
//     }
// }

// import java.util.Scanner;
// public class tut_17 {
//     public static void printSum(int n){
//     int sum=0;
//     {
//         if(n==1)
//         {
//             sum+=n;
//             System.out.println(sum);
//         }
//         sum+=n;
//         printSum(n-1);
//     }

// }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n=sc.nextInt();

//         printSum(n);
//     }
// }

// import java.util.Scanner;
// public class tut_17 {
//     public static void printSum(int i, int n,int sum)
//     {
//         if(i==n)
//         {
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1,n,sum);
//         System.out.println(i);
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n=sc.nextInt();
//         int i=1;
//         int sum=0;

//         printSum(i,n,sum);
//     }
// }


// import java.util.Scanner;
// public class tut_17 {
//     public static int fact(int n)
//     {
//         if(n==0 || n==1)
//         {
//             return 1;
//         }

//         // int fact_nMinus1=fact(n-1);
//         int fact_n =n*fact(n-1);
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n=sc.nextInt();

//        System.out.println(fact(n));
//     }
// }

// import java.util.Scanner;

// public class tut_17 {
// public static void fib(int a,int b,int n)
// {
//     if(n==0)
//     {
//         return;
//     }
//     int c=a+b;
//     System.out.println(c);
//     fib(b,c, n-1);
// }

// public static void main(String[] args)
// {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter n: ");
//     int n=sc.nextInt();

//     int t1=0;
//     int t2=1;
//     System.out.println(t1);
//     System.out.println(t2);
//     fib(t1,t2,n-2);

    
// }
// }


// import java.util.Scanner;
// public  class tut_17{

//     public static int printX(int x,int n)
//     {
//         if(n==0)
//         {
//             return 1;
//         }
//         else if(x==0)
//         {
//             return 0;
//         }

//         int ans= x*printX(x, n-1);
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter x: ");
//         int x=sc.nextInt();

//         System.out.println("Enter n:");
//         int n=sc.nextInt();

//         System.out.println(printX(x,n));
//     }
// }


import java.util.Scanner;
public  class tut_17{

    public static int printX(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(x==0)
        {
            return 0;
        }

        if(n%2==0)
        {
            return printX(x, n/2)*printX(x, n/2);
        }
        else{
            return printX(x, n/2)*printX(x, n/2)*n;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x: ");
        int x=sc.nextInt();

        System.out.println("Enter n:");
        int n=sc.nextInt();

        System.out.println(printX(x,n));
    }
}

