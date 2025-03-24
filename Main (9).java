interface A 
{
    void show();
}
class B 
{
    void display()
    {
        A ob1 = new A()
        {
            public void show()
            {
                System.out.println("Hello");
            }
        };
        ob1.show();
    }
    public static void main(String[] ar)
    {
        B ob = new B();
        ob.display();
    }
}
