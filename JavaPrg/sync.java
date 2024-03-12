class sync extends Thread
{
    sync()
    {
        start();
    }
    public void run()
    {
        x();
    }
    static void x()
    {
        try
        {
            for(int i=1; i<=5; i++)
            {
                System.out.println(i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {

        }
    }
    public static void main(String ar[])
    {
        new sync();
        new sync();
    }
}
