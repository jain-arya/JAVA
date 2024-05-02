class Test{
    public static void pri(String str , String perm , int ind){
        if(str.length()== 0){
            System.out.println(perm);
            return;
        }
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            pri(newstr , perm + ch , ind+1);
        }
    }
    public static void main(String args[]){
        String str = "ABC";
        pri(str,"",0);
    }
}