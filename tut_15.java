import java.util.Scanner;
public class tut_15 {

    public static void main(String[] args) {
        int n=5; //0101
        int pos=1;
        int bitMask= 1<<pos;

        // GET BIT

    //     if((bitMask & n)==0)
    //     {
    //         System.out.println("Bit was zero");
    //     }
    //     else{
    //         System.out.println("Bit was one");
    //     }
    // }


    // SET BIT

    // int newNO =bitMask | n;
    // System.out.println(newNO);
    

    // CLEAR BIT

    // int notBitMask= ~(bitMask);
    // int newNO= notBitMask & n;
    // System.out.println(newNO);

    // UPDATE BIT

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the operation you want to perform:  ");
    int operation= sc.nextInt();

    if(operation==1)
    {
        System.out.println(bitMask | n);
    }
    else{
        int notBitMask= ~(bitMask);
        System.out.println(notBitMask & n);
    }



    }
}
