// Clear a bit 
import java.util.*;
class Test{
    public static void main(String args[]){
        int n = 5;
        int position = 3;
        int Bitmask = 1<<position-1;
        int not = ~(Bitmask);
        int no = not & n;
        System.out.println(no);
    }
}