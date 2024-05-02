class Test
{
int a=10;
public static void main(String args[]){
Test t1 = new Test();
Test t2 = t1;
t2.a++;
t1.a--;
System.out.println(t1.a);
System.out.println(t1.toString());
System.out.println(t1.hashCode());
System.out.println(t2.a);
System.out.println(t2.toString());
System.out.println(t2.hashCode());
}
}