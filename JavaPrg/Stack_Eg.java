import java.util.*;

class Stack_Eg
{
    public static void main (String a[])
    {
        Stack<Integer> st = new Stack<Integer>();
        st.push(3);
        st.push(12);
        st.push(2003);

        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());
    }
}