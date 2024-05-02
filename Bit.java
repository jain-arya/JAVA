// Get Bit at given position;
// in this position is calculated from right and the right most index is 0;
import java.util.*;
class Test{
    public static void main(String args[]){
        int n = 5;
        int position = 3;
        int bitmask = 1<<position-1;
        if((bitmask & n) == 0){
            System.out.println("Bit at given position is 0");
        }
        else{
            System.out.println("Bit at given position is 1");
        }
    }
}