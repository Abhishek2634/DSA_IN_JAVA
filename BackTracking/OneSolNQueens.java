package BackTracking;

public class OneSolNQueens {
    public static void main(String[] args) {
        // t.c = O(N!)  time taken to place one queen (n)  n * n-1 ---- 1;
        //place n queens on a chess board such that no two queens can attack each other.
        int n = 4;
        char board[][] = new char[n][n];
        //initialise
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){
                board[i][j] = 'X';
            }
        }
       if( nQueen(board,0)){
        System.out.println("solution is possible");
        print (board);
       }else{
        System.out.println("solution is not possible");
       }

    }
    static int  count = 0;
    static boolean nQueen(char board[][],int row){
        if(row == board.length){
            // print (board);
            return true;
        }
        for(int j = 0;j < board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            if(nQueen(board, row+1)){
                return true;
            };
           board[row][j] = 'X';// backtracking step  , unplacing queens for other solutions
            }

        }
        return false;
    }
    static boolean isSafe(char board[][],int row ,int col){
        //vertically up
        for(int i = row - 1; i >= 0;i--){
            if(board[i][col] == 'Q' ){
                return false;
            }
        }
        // diagonally up left
        for(int i = row -1 , j = col-1;i >= 0 && j >= 0 ;j--,i--){
            if(board[i][j] == 'Q' ){
                return false;
            }
        }
        //diagonally up right;
        for(int i = row -1 , j = col+1;i >= 0 && j < board.length ;j++,i--){
            if(board[i][j] == 'Q' ){
                return false;
            }
        }
        return true;
    }
    static void print(char board[][]){
        System.out.println("---------------chess board-----------------");
        for(int i = 0 ; i < board.length;i++){
            for(int j = 0;j < board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}

