class m 
{
  int fact(int n)
  {
    if(n==0)
    {
      return 0;
    }
    else if(n==1)
    {
      return 1;
    }
    else
    {
      return n*fact(n-1);
    }
  }

  public static void main(String ar[])
  {
    int n = Integer.parseInt(ar[0]);
    System.out.println("Factorial of the number :");
    System.out.println(new m().fact(n));
  }
}
 