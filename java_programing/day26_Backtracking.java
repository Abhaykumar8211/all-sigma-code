// public class day26_Backtracking {
//     public static void changearr(int arr[], int i, int val){
//         // base case
//         if(val == arr.length){
//             printarr(arr);
//             return;

//         }
//         // recursion(kaam)
//         arr[i] = val;
//         changearr(arr, i+1, val+1);
//         arr[i] = arr[i] - 2;
//     }

//     public static void printarr(int arr[]){
//         for(int i=0; i<=arr.length-1; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         changearr(arr, 0, 1);
//         printarr(arr);

//     }
    
// }


// public class day26_Backtracking {
//     public static void findsubset(String str, int i, String ans){
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("null");
//             }else{
//                 System.out.println(ans);

//             }
//             return;

//         }
//         // yes choise
//         findsubset(str, i+1, ans+str.charAt(i));
//         // no choise
//         findsubset(str, i+1, ans);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findsubset(str, 0, "");
//     }
// }




// public class day26_Backtracking {
//     public static void findpermutation(String str, String ans){
//         // base case
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }
//         // recursion
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             // "abcde" => "ab" + "de" = "abde"
//             String Newstr = str.substring(0, i) + str.substring(i+1);
//             findpermutation(Newstr, ans+curr);
//         } 
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findpermutation(str, "");
//     }
// }


// n Queen
// public class day26_Backtracking {
//     public static boolean isSafe(char board[][], int row, int col){
//         // vertical
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void nQueens(char board[][], int row){
//         // base
//         if(row == board.length){
//             printboard(board);
//             return;
//         }
//         // coloman
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);  //function call
//                 board[row][j] = 'x'; //backtracking

//             }
            
//         }
//     }
//     public static void printboard(char board[][]){
//         System.out.println("_______chrss board_______");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];

//         // initilize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
           
//         }
//         nQueens(board, 0);
//     }
// }



// total ways to solve n queens
// public class day26_Backtracking {
//     public static boolean isSafe(char board[][], int row, int col){
//         // vertical
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static void nQueens(char board[][], int row){
//         // base
//         if(row == board.length){
//             // printboard(board); comment
//             count ++;

//             return;
//         }
//         // coloman
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);  //function call
//                 board[row][j] = 'x'; //backtracking

//             }
            
//         }
//     }
//     public static void printboard(char board[][]){
//         System.out.println("_______chrss board_______");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static int count = 0;

//     public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];

//         // initilize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
           
//         }
//         nQueens(board, 0);
//         System.out.println("total ways to solve n queens = "+count);
//     }
// }





// public class day26_Backtracking {
//     public static boolean isSafe(char board[][], int row, int col){
//         // vertical
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }
//         return true;

//     }

//     public static boolean nQueens(char board[][], int row){
//         // base
//         if(row == board.length){
//             printboard(board); 
//             return true;
//         }
//         // coloman
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 if(nQueens(board, row+1)){
//                     return true;

//                 }  
//                 board[row][j] = 'x'; //backtracking

//             }
            
//         }
//         return false;
//     }
//     public static void printboard(char board[][]){
//         System.out.println("_______chrss board_______");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     static int count = 0;

//     public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];

//         // initilize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
           
//         }
//         if(nQueens(board, 0)){
//             System.out.println("solution is possible");
//         }
//         else{
//             System.out.println("solution is not possible");
//         }
       
//     }
// }


// Grid ways
// public class day26_Backtracking {
//     public static int Gridways(int i, int j, int m, int n){
//         // base case
//         if(i ==n-1 && j == m-1){
//             return 1;
//         }else if(i == n || j == n){
//             return 0;
//         }

//         int w1 = Gridways(i+1, j, m, n);
//         int w2 = Gridways(i, j+1, m, n);

//         return w1 + w2;
//     }

//     public static void main(String[] args) {
//         int m = 2, n =2;
//         System.out.println(Gridways(0, 0, m, n));
//     }
// }








// Sudoku Solver
// public class day26_Backtracking {

//     // function to check whether placing digit is safe or not
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

//         // column check
//         for (int i = 0; i <= 8; i++) {
//             if (sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         // row check
//         for (int j = 0; j <= 8; j++) {
//             if (sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         // grid check
//         int sr = (row / 3) * 3;
//         int sc = (col / 3) * 3;

//         // 3x3 grid check
//         for (int i = sr; i < sr + 3; i++) {
//             for (int j = sc; j < sc + 3; j++) {
//                 if (sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     // sudoku solver using recursion + backtracking
//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {

//         // base case
//         if (row == 9) {
//             return true;
//         }

//         // next row & column
//         int nextRow = row;
//         int nextCol = col + 1;

//         if (col + 1 == 9) {
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         // if cell already filled
//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         // try digits from 1 to 9
//         for (int digit = 1; digit <= 9; digit++) {

//             if (isSafe(sudoku, row, col, digit)) {

//                 sudoku[row][col] = digit;

//                 if (sudokuSolver(sudoku, nextRow, nextCol)) { // solution exists
//                     return true;
//                 }

//                 sudoku[row][col] = 0; // backtracking
//             }
//         }

//         return false;
//     }

//     // function to print sudoku
//     public static void printSudoku(int sudoku[][]) {

//         for (int i = 0; i < 9; i++) {

//             for (int j = 0; j < 9; j++) {

//                 System.out.print(sudoku[i][j] + " ");
//             }

//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {

//         int sudoku[][] = {
//                 {0, 0, 8, 0, 0, 0, 0, 0, 0},
//                 {4, 9, 0, 1, 5, 7, 0, 0, 2},
//                 {0, 0, 3, 0, 0, 4, 1, 9, 0},
//                 {1, 8, 5, 0, 6, 0, 0, 2, 0},
//                 {0, 0, 0, 0, 2, 0, 0, 6, 0},
//                 {9, 6, 0, 4, 0, 5, 3, 0, 0},
//                 {0, 3, 0, 0, 7, 2, 0, 0, 4},
//                 {0, 4, 9, 0, 3, 0, 0, 5, 7},
//                 {8, 2, 7, 0, 0, 9, 0, 1, 3}
//         };

//         if (sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("solution exists");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("solution does not exist");
//         }
//     }
// }




// Laravel.io
// Open sidebar;
class KnightTour { 
	static int N = 8; 
 
	
	static boolean isSafe(int x, int y, int sol[][]) 
	{ 
		return (x >= 0 && x < N && y >= 0 && y < N 
				&& sol[x][y] == -1); 
	} 
 
	
	static void printSolution(int sol[][]) 
	{ 
		for (int x = 0; x < N; x++) { 
			for (int y = 0; y < N; y++) 
				System.out.print(sol[x][y] + " "); 
			System.out.println(); 
		} 
	} 
 
	
	static boolean solveKT() 
	{ 
		int sol[][] = new int[8][8]; 
 
		/* Initialization of solution matrix */
		for (int x = 0; x < N; x++) 
			for (int y = 0; y < N; y++) 
				sol[x][y] = -1; 
 
		
		int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
		int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 
 
        /*
        curr = (5,5);
        Moves -> (5+xMove[idx], 5+ymove[idx])
        idx 0 -> 5+2, 5+1
        idx 1 -> 5+1, 5+2
        idx 2 -> 5-1, 5+2
        */
 
		// Since the Knight is initially at the first block 
		sol[0][0] = 0; 
 
		
		if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) { 
			System.out.println("Solution does not exist"); 
			return false; 
		} 
		else
			printSolution(sol); 
 
		return true; 
	} 
 
	
	static boolean solveKTUtil(int x, int y, int movei, 
							int sol[][], int xMove[], 
							int yMove[]) 
	{ 
		int k, next_x, next_y; 
		if (movei == N * N) 
			return true; 
 
		/* Try all next moves from the current coordinate 
			x, y */
		for (k = 0; k < 8; k++) { 
			next_x = x + xMove[k]; 
			next_y = y + yMove[k]; 
			if (isSafe(next_x, next_y, sol)) { 
				sol[next_x][next_y] = 0; 
				if (solveKTUtil(next_x, next_y, movei + 1, 
								sol, xMove, yMove)) 
					return true; 
				else
					sol[next_x][next_y] 
						= -1; // backtracking 
			} 
		} 
 
		return false; 
	} 
 
	public static void main(String args[]) 
	{  
		solveKT(); 
	} 
}
