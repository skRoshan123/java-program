class prime
{
    public static void main(String ar[])
    {
        int n = Integer.parseInt(ar[0]);
        int i,prime=0;

        for(i=1; i<=n; i++)
        {
           if(n%i == 0)
           {
            prime++; 
           }
        }
        if(prime == 2)
        {
            System.out.println("It's a prime number");
        }
        else
        {
            System.out.println("It's not a prime number");
        }
    }
} 