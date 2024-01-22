// class tut_1{
//     public static void main(String args[])
//     {
//         System.out.println("Hello World!");
//     }
// }

// import java.util.Scanner;

// class tut_1{
//     public static void main(String[] args) {
//         Scanner s=  new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a= s.nextInt();
//         System.out.print("Enter b: ");
//         int b= s.nextInt();
//         int sum=a+b;
//         System.out.print("sum is: "+ sum);

//     }
// }

import java.util.Scanner;

class tut_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of math: ");
        float maths= sc.nextFloat();
        System.out.println("Enter marks of physics: ");
        float physics= sc.nextFloat();
        System.out.println("Enter marks of chemistry: ");
        float chemistry=sc.nextFloat();
        float avg= (maths + physics + chemistry)/3;
        System.out.println("Average: "+avg);

        


    }
}