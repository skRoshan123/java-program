 class exc2 
 {
    public static void main (String ar[])
    {
         String s=ar[0];
         if(s.equals("Roshan"))
           System.out.println("Access granted\n");
           System.out.println("Hello mr Roshan\n");

           else
           {
                 try
                 {
                     NoMatchException nme = new NoMatchException();
                     throw nme;
                     throw new NoMatchException();
                 }
                 catch(NoMatchException e)
                 {
                       System.out.println(e);
                 }
           }

    }
 }
