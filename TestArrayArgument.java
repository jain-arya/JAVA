class Test{

void add(int a[]){
int sum = 0;
for(int i=0 ; i<a.length ; i++){
sum = sum + a[i];
}
System.out.println(sum);
}

public static void main(String args[]){
Test t1 = new Test();
Test t2 = new Test();
int x[] = {1,2,3};
int y[] = {100,200,300,400,500};
t1.add(x);
t2.add(y);
}
}

  