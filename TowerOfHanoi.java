class Test{
    static void Tower(int n , String src , String help , String des){
        if(n==1){
            System.out.println("Transfer disk" + n + " from "+src+" to "+des);
            return;
        }
        Tower(n-1 , src , des , help);
        System.out.println("Transfer disk" + n + " from "+src+" to "+des);
        Tower(n-1 , help , src , des);
    }
    public static void main(String args[]){
        int n = 2;
        Tower(n,"A","B","C");
    }
}