class p
{
    int x,y;
    p()
    {
        x=y=0;
    }
    p(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println("("+ x + "," + y + ")");;
    }
    p add(p a1, p a2)
    {
        p a =new p();
        a.x = a1.x * a2.x;
        a.y = a1.y * a2.y;
        return a;
    }
    public static void main(String ar[])
    {
        int x, y;
        x=Integer.parseInt(ar[0]);
        y=Integer.parseInt(ar[1]);
        p a1=new p(x, y);
        x=Integer.parseInt(ar[2]);
        y=Integer.parseInt(ar[3]);
        p a2=new p(x, y);
        p a3=new p();
        a3=a3.add(a1, a2);
        a1.show();
        a2.show();
        a3.show();
    }
}
