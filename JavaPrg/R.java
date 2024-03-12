import java.util.*;

class rsk
{
    public static void main(String ar[])
    {
        String s = "I can do this all";
        StringTokenizer st=new StringTokenizer(s, ",; ", true);
        while(st.hasMoreTokens ())
        {
            System.out.println(st.nextToken());
        }
    }
}