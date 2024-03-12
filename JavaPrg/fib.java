class fib
{
    int Fib(int n)
    {

    if(n==0 || n==1) {
        return n;
    }

    else 
    {
        return Fib(n-1)+Fib(n-2);
    }
}

 public static void main(String ar[])
 {
    int n = Integer.parseInt(ar[0]);
    System.out.println("Fibbonaci terms are : \t");
    System.out.println(new fib().Fib(n));
 }

}