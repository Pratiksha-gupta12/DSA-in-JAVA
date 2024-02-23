public class tut_13 {
    public static void main(String[] args) {
         StringBuilder sb=new StringBuilder("Hello");
        //  System.out.println(sb);

        //  charAt
        // for(int i=0;i<sb.length();i++)
        // {
        //     System.out.println(sb.charAt(i));
        // } 
 
        // SetCharAt
        // sb.setCharAt(1, 'i');
        // System.out.println(sb);

        // insert
        // sb.insert(1,'m');
        // System.out.println(sb);

        // delete
        // sb.delete(1,2);
        // System.out.println(sb);

        // Append

        // sb.append("e");
        // sb.append("ll");
        // // sb.append(" "); 
        // sb.append("o");
        // System.out.println(sb);
        
        // System.out.println(sb.length());

        // reverse of string
        // System.out.println(sb.reverse());

        // another method of reversing the string:

        for(int i=0;i<sb.length()/2;i++)
        {
            int  front=i;
            int back= sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);








    }
}
