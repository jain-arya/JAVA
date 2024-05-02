class Test
{
public static void main(String args[])
{
int a[] = {50,30,10,40,20};
int i,j,temp;
for(i=0 ; i<a.length-1 ; i++){
for(j=i+1 ; j<a.length ; j++){
if(a[i]>a[j]){
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
for(int x:a){
System.out.println(x);
}
}
}
