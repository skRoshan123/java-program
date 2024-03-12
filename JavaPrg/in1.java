import java.util.*; 
class in1 {
        
         public static void main (String ar[])
         {
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter the numbers : ");
            int r = sn.nextInt();
            int s = sn.nextInt();
            int k = sn.nextInt();

            int ans = r+s+k;

            System.out.println("The answer is : "+ans);
         }
}
