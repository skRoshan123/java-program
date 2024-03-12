import java.util.*;
class insert
{
    public static void main(String ar[])
    {
         int i;

         Scanner sn = new Scanner(System.in);
         System.out.println("Enter the array size : ");
         int n = sn.nextInt();
      
         int a[] = new int[100];

         System.out.println("Enter the elements in the array : ");
         for(i=0; i<n; i++)
         
           a[i] = sn.nextInt();
         

         System.out.println("Enter the element want to creat : ");
         int c = sn.nextInt();

         System.out.println("Enter the position want to place : ");
         int p = sn.nextInt();

         for(i=n; i>=p; i--)
         
            a[i] = a[i-1];
            a[i] = c;
            n++;
         
        System.out.println("New element created : ");
        
        for(i=0; i<n; i++)
        
            System.out.println(a[i]);
        

    }
}
