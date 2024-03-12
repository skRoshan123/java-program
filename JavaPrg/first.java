class first
{
    public static void main(String ar[])
    {
        int i = Integer.parseInt(ar[0]);
        
        if(i % 400 == 0)
        {
            System.out.println(i+" is a leap year");
        }
        else if(i % 100 == 0)
        {
            System.out.println(i+" is not a leap year");
        }
        else if(i % 4 == 0)
        {
            System.out.println(i+" is a leap year");
        }
        else
        {
            System.out.println(i+" is not a leap year");
        }
        
    }
}
