// BUBBLE SORT

// import java.util.Scanner;
// public class tut_16 {

//     public void bubbleSort(int a[]){
//         for(int i=0;i<a.length-1;i++)
//         {
//             for(int j=0;j<a.length-i-1;j++)
//             {
//                 if(a[j]>a[j+1])
//                 {
//                     int temp= a[j];
//                     a[j]= a[j+1];
//                     a[j+1]=temp;
//                 }
//             }
//         }

//     }

//     public void printArray(int a[]){
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
        
        
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter size of the array: ");
//         int n= sc.nextInt();
//         int[] arr= new int[n];

//         for(int i=0;i<n;i++)
//         {
//             arr[i]= sc.nextInt();
//         }
//         tut_16 t= new tut_16();

//         t.bubbleSort(arr);
//         t.printArray(arr);


//     }
// }


// SELECTION SORT


// import java.util.Scanner;
// public class tut_16 {

//     public void selectionSort(int a[]){
//         for(int i=0;i<a.length-1;i++)
//         {
//             int smallest=i;
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if( a[smallest]>a[j])
//                 {
//                     smallest=j;
//                 }
//             }
//             int temp=a[smallest];
//             a[smallest]=a[i];
//             a[i]=temp;

//         }

//     }

//     public void printArray(int a[]){
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
        
        
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter size of the array: ");
//         int n= sc.nextInt();
//         int[] arr= new int[n];

//         for(int i=0;i<n;i++)
//         {
//             arr[i]= sc.nextInt();
//         }
//         tut_16 t= new tut_16();

//         t.selectionSort(arr);
//         t.printArray(arr);

//     }
// }


// INSERTION SORT
import java.util.Scanner;
public class tut_16 {

    public void insertionSort(int a[]){
        for(int i=1;i<a.length;i++)
        {
            int current= a[i];
            int j=i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }

    }

    public void printArray(int a[]){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        tut_16 t= new tut_16();

        t.insertionSort(arr);
        t.printArray(arr);
    
    }
}