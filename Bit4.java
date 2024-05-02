import java.util.*;
// position main jo bhi update karna hai usko oper me dal do
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitmask = 1<<position;
        if(oper == 1){
            int no = bitmask | n;
            System.out.println(no);
        }
        else{
            int not = ~(bitmask);
            int no = not & n;
            System.out.println(no);
        }
    }
}