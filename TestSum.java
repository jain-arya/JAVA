class Test
{
public static void main(String args[])
{
int n=153 ,r, sum =0;
while(n!=0)
{
r=n%10;
sum = sum + r;
n=n/10;
}
System.out.println(sum);
}
}
