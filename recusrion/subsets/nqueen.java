package subsets;
import java.util.*;
// class nqueen {
//     public static List < List < String >> solveNQueens(int n) {
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++)
//             for (int j = 0; j < n; j++)
//                 board[i][j] = '.';
//         List < List < String >> res = new ArrayList < List < String >> ();
//         int leftRow[] = new int[n];
//         int upperDiagonal[] = new int[2 * n - 1];
//         int lowerDiagonal[] = new int[2 * n - 1];
//         solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
//         return res;
//     }



//     static void solve(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]) {
//         if (col == board.length) {
//             res.add(construct(board));
//             return;
//         }

//         for (int row = 0; row < board.length; row++) {
//             if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
//                 board[row][col] = 'Q';
//                 leftRow[row] = 1;
//                 lowerDiagonal[row + col] = 1;
//                 upperDiagonal[board.length - 1 + col - row] = 1;
//                 solve(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
//                 board[row][col] = '.';
//                 leftRow[row] = 0;
//                 lowerDiagonal[row + col] = 0;
//                 upperDiagonal[board.length - 1 + col - row] = 0;
//             }
//         }
//     }


//     static List < String > construct(char[][] board) {
//         List < String > res = new ArrayList < String > ();
//         for (int i = 0; i < board.length; i++) {
//             String s = new String(board[i]);
//             System.out.println("Hello");
//             System.out.println(s);
//             res.add(s);
//         }
//         return res;
//     }
//     public static void main(String args[]) {
//         int N = 4;
//         List < List < String >> queen = solveNQueens(N);
//         int i = 1;
//         for (List < String > it: queen) {
//             System.out.println("Arrangement " + i);
//             for (String s: it) {
//                 System.out.println(s);
//             }
//             System.out.println();
//             i += 1;
//         }

//     }
// }




class nqueen{
    static List<List<String>> solvequeen(int n){
        char board[][] = new char[n][n];
        List<List<String>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int leftdiagonal[] = new int[2*n-1];
        int rightdiagonal[] = new int[2*n-1];
        int row[] = new int[n];
        List<Integer> rows = new ArrayList<>();
        solve(0,l,board,row,leftdiagonal,rightdiagonal,rows);
        return l;
    }
    static void solve(int col,List<List<String>> l,char b[][],int r[],int left[],int right[],List<Integer> rows){
        if(col==b.length){
            l.add(construct(b));
            System.out.println("Queens placed at rows: " + rows);
            return;
        }
        for(int row=0;row<b.length;row++){
            if(r[row]==0 && left[row+col]==0 && right[b.length-1+(col-row)]==0){
                b[row][col]='Q';
                r[row]=1;
                left[row+col]=1;
                right[b.length-1+col-row]=1;
                rows.add(row+1);
                solve(col+1,l,b,r,left,right,rows);
                b[row][col]='.';
                r[row]=0;
                left[row+col]=0;
                right[b.length-1+col-row]=0;
                rows.remove(rows.size() - 1);
            }
        }
    }
    static List<String> construct(char[][] b){
        List<String> l = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            String s = new String(b[i]);
            l.add(s);
        }
        return l;
    }
    public static void main(String[] args) {
        List<List<String>> l = solvequeen(4);
        System.out.println(l);
        
    }
}