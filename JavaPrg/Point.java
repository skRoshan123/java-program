class Point
{
    int x, y;
    Point()
    {
        x=y=0;
    }
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void show()
    {
        System.out.println("(" + x + "," + y + ")");
    }
    void add(Point p1, Point p2)
    {
        x=p1.x+p2.x;
        y=p1.y+p2.y;
    }
    public static void main(String ar[])
    {
        int x, y;
        x=Integer.parseInt(ar[0]);
        y=Integer.parseInt(ar[1]);
        Point p1=new Point(x, y);
        x=Integer.parseInt(ar[2]);
        y=Integer.parseInt(ar[3]);
        Point p2=new Point(x, y);
        Point p3=new Point();
        p3.add(p1, p2);
        p1.show();
        p2.show();
        p3.show();
    }
}