// public class day26_Backtracking {
//     public static boolean issafe(int Maze[][], int x, int y, int n){
//         if(x >= 0 && y >= 0 && x < n && y < n && Maze[x][y] == 1){
//             return true;
//         }
//         return false;
//     }

//     public static boolean solveMaze(int Maze[][], int x, int y, int sol[][], int n){
//         if(x == n-1 && y == n-1){
//             sol[x][y] = 1;
//             return true;
//         }

//         if(issafe(Maze, x, y, n)){
//             sol[x][y] = 1;

//             if(solveMaze(Maze, x+1, y, sol, n)){
//                 return true;
                      
//             }
//             if(solveMaze(Maze, x, y+1, sol, n)){
//                 return true;
//             }

//             // back tracking 
//             sol[x][y] = 0;
//             return false;
//         }
//         return false;
//     }
//     public static void printsolution(int Maze[][], int n){
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(Maze[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int Maze[][] = {
//                 {1, 0, 0, 0},
//                 {1, 1, 0, 1},
//                 {0, 1, 0, 0},
//                 {1, 1, 1, 1}
//         };
//         int n = 4;

//         int sol[][] = new int[n][n];
//         if(solveMaze(Maze, 0, 0, sol, n)){
//             printsolution(sol, n);
//         }else{
//             System.out.println("no path found");
//         }

//     }
// }



// keyboard
// public class day26_Backtracking {

//     // keypad mapping
//     static String keypad[] = {
//             "", "", "abc", "def", "ghi",
//             "jkl", "mno", "pqrs", "tuv", "wxyz"
//     };

//     public static void printCombinations(String digits, int index, String combination) {

//         // base case
//         if (index == digits.length()) {
//             System.out.println(combination);
//             return;
//         }

//         // current digit
//         char currDigit = digits.charAt(index);

//         // letters for that digit
//         String letters = keypad[currDigit - '0'];

//         // loop through letters
//         for (int i = 0; i < letters.length(); i++) {
//             printCombinations(digits, index + 1, combination + letters.charAt(i));
//         }
//     }

//     public static void main(String[] args) {

//         String digits = "23";

//         if (digits.length() == 0) {
//             System.out.println("No combinations");
//             return;
//         }

//         printCombinations(digits, 0, "");
//     }
// }



class day26_Backtracking {

    static int N = 8;

    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.print(sol[x][y] + " ");
            System.out.println();
        }
    }

    public static boolean solveKT() {

        int sol[][] = new int[N][N];

        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;

        int xMove[] = {2,1,-1,-2,-2,-1,1,2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        sol[0][0] = 0;

        if (!solveKTUtil(0,0,1,sol,xMove,yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else
            printSolution(sol);

        return true;
    }

    public static boolean solveKTUtil(int x,int y,int movei,
                                      int sol[][],int xMove[],int yMove[]) {

        int k,next_x,next_y;

        if(movei == N*N)
            return true;

        for(k=0;k<8;k++) {

            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if(isSafe(next_x,next_y,sol)) {

                sol[next_x][next_y] = movei;

                if(solveKTUtil(next_x,next_y,movei+1,sol,xMove,yMove))
                    return true;
                else
                    sol[next_x][next_y] = -1;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        solveKT();
    }
}