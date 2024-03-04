// TOWER OF HANOI

// public class tut_18 {
//     public static void towerOfHanoi(int n,String src,String helper,String dest)
//     {
//         if(n==1)
//         {
//             System.out.println("Transfer of disk "+n+ " from "+ src+" to "+dest);
//             return;
//         }
//         towerOfHanoi(n-1, src, dest, helper);
//         System.out.println("Transfer of disk "+n+ " from "+ src+" to "+dest);
//         towerOfHanoi(n-1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n=4;
//         towerOfHanoi(n,"S" ,"H" ,"D");
//     }
// }


// PRIINT STRING IN REVERSE
// import java.util.Scanner;
// public class tut_18 {
//     public static void rev(String str,int index){
//     if(index==0)
//     {
//         System.out.println(str.charAt(index));
//         return;
//     }

//     System.out.print(str.charAt(index));
//     rev(str,index-1);

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter string: ");
//         String str=sc.nextLine();
//         rev(str,str.length()-1);
//     }
// }


// Find and last occurance of element in a string
// import java.util.Scanner;
// public class tut_18 {

//     public static int first=-1;
//     public static int last=-1;
//     public static void occurance(String str,int idx,char key){
        
//      if(idx==str.length())
//         {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }

//         char current =str.charAt(idx);
//         if(current==key)
//         {
//             if(first==-1)
//             {
//                 first= idx;
//             }
//             else{
//                 last=idx;
//             }
//         }
//         occurance(str, idx+1, key);
    

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter string: ");
//         String str=sc.nextLine();
//         System.out.println("Enter the character you want to search: ");
//         char key=sc.next().charAt(0);
//         occurance(str,0,key);
//         System.out.println(str.length());
//     }
// }



// Check if an array is sorted (Strictly increasing)
// import java.util.Scanner;

// public class tut_18 {
//     public static boolean isSorted(int[] a,int i){

//         if(i==a.length-1)
//         {
//             return true;
//         }

//     //    if(a[i]<a[i+1])
//     //    {
//     //      return isSorted(a, i+1);
//     //    }
//     //    else{
//     //     return false;
//     //    }

//     if(a[i]>=a[i+1])
//        {
//          return false;
//        }
//        else{
//         return isSorted(a, i+1);
//        }
//     }

//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter size of the array: ");
//         int n=sc.nextInt();

//         int[] a=new int[n];
//         int i;
//         System.out.println("Enter elements of array: ");
//         for(int j=0;j<n;j++)
//         {
//             a[j]=sc.nextInt();
//         }

//         System.out.println(isSorted(a, 0));
//     }
// }


// Move all X to the end of the string

// public class tut_18 {

//     public static void moveX(String str,int index,int count,String new_str)
//     {

//         if(index==str.length())
//         {
//             for(int i=0;i<count;i++)
//             {
//                 new_str+='x';
//             }
//             System.out.println(new_str);
//             return;
//         }
//          char current= str.charAt(index);

//          if(current=='x')
//          {
//             count++;
//             moveX(str, index+1, count, new_str);
//          }
//          else{
//             new_str+=current;
//             moveX(str, index+1, count, new_str);
//          }
//     }
//     public static void main(String[] args) {
//         String str="axbcxxd";
//         moveX(str, 0, 0, "");

//     }
// }


// Remove duplicates from the string
// public class tut_18 {
//     public static boolean [] map= new boolean[26];

//     public static void removeDup(String str,int index,String new_str)
//     {

//         if(index==str.length())
//         {
//             System.out.println(new_str);
//             return;
//         }
//          char current= str.charAt(index);

//          if(map[current-'a'])
//          {
//             removeDup(str, index+1, new_str);
//          }
//          else{
//             new_str+=current;
//             map[current-'a']=true;
//             removeDup(str, index+1, new_str);
//          }
//     }
//     public static void main(String[] args) {
//         String str="avvhasga";
//         removeDup(str, 0, "");

//     }
// }

// // Print all the susbsequences of a string

// public class tut_18 {
//     public static void susbsequences(String str,int index,String new_str)
//     {
//         if(index==str.length())
//         {
//             System.out.println(new_str);
//             return;
//         }

//         char current= str.charAt(index);

//         susbsequences(str, index+1, new_str+current);

//         susbsequences(str, index+1, new_str);
//     }

//     public static void main(String[] args) {
//         String str="abc";
//         susbsequences(str, 0, "");
//     }
// }



// Print all the unique susbsequences of a string
// import java.util.HashSet;
// public class tut_18 {
//     public static void susbsequences(String str,int index,String new_str,HashSet<String> set)
//     {
//         if(index==str.length())
//         {
//             if(set.contains(new_str))
//             {
//                 return;
//             }
//             else{
//             System.out.println(new_str);
//             set.add(new_str);
//             return;
//             }
//         }

//         char current= str.charAt(index);

//         susbsequences(str, index+1, new_str+current,set);

//         susbsequences(str, index+1, new_str,set);
//     }

//     public static void main(String[] args) {
//         String str="aaa";
//         HashSet<String> set=new HashSet<>();
 
//         susbsequences(str, 0, "",set);
//     }
// }


// Print keypad combination


// Print all the susbsequences of a string

public class tut_18 {

    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str,int index,String combination)
    {
        if(index==str.length())
        {
            System.out.println(combination);
            return;
        }

        char current= str.charAt(index);

        String mapping=keypad[current-'0'];

        for(int i=0;i<mapping.length();i++)
        {
            printComb(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="23";
        printComb(str, 0, "");
    }
}