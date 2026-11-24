// import java.util.*;
// public class multi_dia_arrays {
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);

//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j] = sc.nextInt();

//             }
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }


// 


// print spiral ........?
// public class multi_dia_arrays {
//     public static void printspiral(int matrix[][]){
//         int startrow = 0;
//         int startcol = 0;
//         int endrow = matrix.length-1;
//         int endcol = matrix[0].length-1;

//         while (startrow <= endrow && startcol <= endcol) {
            
//             // top
//             for(int j=startcol; j<=endcol; j++){
//                 System.out.print(matrix[startrow][j]+" ");
//             }

//             // right
//             for(int i=startrow+1; i<=endrow; i++){
//                 System.out.print(matrix[i][endcol]+" ");
//             }
//             // bottom
//             for(int j=endcol-1; j>startcol; j--){
//                 if(startrow == endrow){
//                     break;
//                 }
//                 System.out.print(matrix[endrow][j]+" ");
//             }
//             // left
//             for(int i =endrow-1; i>=startrow+1; i--){
//                 if(startcol == endcol){
//                     break;

//                 }
//                 System.out.print(matrix[i][startcol]+" ");
//             }
//             startcol++;
//             startrow++;
//             endcol--;
//             endrow--;

        

//         }
//     }

//     public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},
        //                  {5,6,7,8},
        //                  {9,10,11,12},
        //                  {13,14,15,16}};
        
//         printspiral(matrix);
//     }
// }



// search in sorted matrix
public class multi_dia_arrays {
    public static boolean search_matrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(matrix[row][col] == key){
                System.out.println("("+row+","+col+")");
                return true;
            }
            else if (key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        search_matrix(matrix, 10);

    }
}