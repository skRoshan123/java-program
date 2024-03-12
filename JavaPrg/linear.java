import java.util.*;

class linear
{
    public static void main (String ar[])
    {    
        int i;
        Scanner sn = new Scanner(System.in);
        
        System.out.println("size of the array ? : ");
        int n = sn.nextInt();
        
        int a[] = new int[100];
        System.out.println("Elements in the array ? : ");
        for(i = 1; i<=n; i++)
        {
            a[i] = sn.nextInt();
        }

        System.out.println("number to find ? : ");
        int val = sn.nextInt();
        
        for(i=1; i<=n; i++)
        {
              if(a[i] == val)
              {
                break;
              }
        }
        if(i <=n )
        {
            System.out.println("Element found at position "+i);
        }
        else
        {
            System.out.println("Element not found ");
        }
    }
}