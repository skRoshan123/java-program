class Distance
{
    double x,y;
    Distance()
    {
        x=y=0;
    }
    Distance(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    void show()
    {
        System.out.println("(" + x + "," + y + ")");
    }

    void add(Distance d1, Distance d2)
    {
        x = Math.sqrt(d2.x - x * d2.x - x); 
        y = Math.sqrt(d2.y - y * d2.y - y);
        
    }

    public static void main(String ar[])
    {
        double x, y;
        x=Double.parseDouble(ar[0]);
        y=Double.parseDouble(ar[1]);
        Distance d1=new Distance(x, y);
        x=Double.parseDouble(ar[2]);
        y=Double.parseDouble(ar[3]);
        Distance d2=new Distance(x, y);
        Distance d3=new Distance();
        d3.add(d1, d2);
        d1.show(); 
        d2.show();
        d3.show();
    }
}