import java.util.*;

class binarysearch
{
    public static void main (String ar[])
    {   
       
        int i,low=0,mid,high;
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Size of array : ");
        int n = sn.nextInt();
        
        int a[] = new int[100];
        System.out.println("Number in the array : ");
        for(i=1; i<=n; i++)
        
            a[i] = sn.nextInt();
        

        System.out.println("Number to find : ");
        int val = sn.nextInt();

        high = n - 1;
        mid = (low+high)/2;

        while(low <=high )
        {
             if(a[mid] < val )
                
                 low = mid + 1;
                
            else if(a[mid] == val)
            {
                System.out.println("Number position : "+mid);
                break;
            }

            else
               
            high = mid - 1;
            mid = (low+high)/2;
              
        }
        if(low > high)
         System.out.println("Element not found in the array");
    
    }
}
