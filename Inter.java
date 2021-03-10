interface i1
{
void show1();
void show2();
}

class A implements i1
{
public void show1()
{
System.out.print("Show1");
}
public void show2()
{
System.out.print("Show2");
}
}

class Inter
{
public static void main(String Args[])
{
A obj = new A();
obj.show1();
obj.show2();

}
}