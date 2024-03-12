class exc1
{
    public static void main (String ar[])
    {
        try
        {
            int a = Integer.parseInt(ar[0]);
            int b = Integer.parseInt(ar[1]);
            int ans = a/b;

            System.out.println(+ans);
        }

    catch(ArrayIndexOutOfBoundsException e)
        {
               System.out.println("Exception message : "+e);
        }
    }
}