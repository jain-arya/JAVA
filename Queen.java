import java.util.Scanner;
class Test{
    //x is row and y is column
    public static boolean isSafe(int arr[][] , int x , int y , int n){
        //check in column if queen is there or not
        for(int row=0 ; row<x ; row++){
            if(arr[row][y] == 1){
                return false;
            }
        }

        //check in left diagonals
        int row = x;
        int col = y;
        while(row >=0 && col >=0){
            if(arr[row][col] == 1){
                return false;
            } 
            row--;
            col--;
        }

        //check in right diagonals
        row = x;
        col = y;
        while(row >=0 && col<n){
            if(arr[row][col] == 1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
    public static boolean nQueen(int arr[][] , int x , int n){
        if(x >= n){
            return true;
        }
        for(int col=0 ; col<n ; col++){
            if(isSafe(arr,x,col,n)){
                arr[x][col] = 1;
                if(nQueen(arr,x+1,n)){
                    return true;
                }
                arr[x][col] = 0;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = 0;
            }
        }

        if(nQueen(arr,0,n)){
            for(int i=0 ; i<n ; i++){
                for(int j=0 ; j<n ; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}