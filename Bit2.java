//Set Bit
// Set 2nd bit of a no n = 0101
class Test{
    public static void main(String args[]){
        int n = 5;
        int position = 2;
        int Bitmask = 1<< position-1;
        int no = Bitmask | n ;
        System.out.println(no);
    }
}