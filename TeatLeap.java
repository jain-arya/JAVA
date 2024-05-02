class Test
{
public static void main(String args[])
{
int n = 2023;
if(n%400 == 0)
System.out.print("Leap year");
else if (n%100 == 0)
System.out.print("Non leap year");
else if(n%4 == 0)
System.out.print("Leap year");
else
System.out.print("Non leap year");
}
}