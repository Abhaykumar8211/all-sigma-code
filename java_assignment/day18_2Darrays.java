// public class day18_2Darrays {

//     public static void main(String[] args) {
        
//         int arr[][] = { {4,7,8},{8,8,7} };
//         int count = 0;

//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr[0].length; j++){
//                 if(arr[i][j] == 7){
//                     count++;
//                 }
//             }
//         }
//         System.out.println("count of 7 is: "+count);
//     }
// }



// print secomd row of sum
// public class day18_2Darrays {

//     public static void main(String[] args) {
//         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        
//         int sum = 0;
       
//         for(int j=0; j<nums[0].length; j++){
//             sum += nums[1][j];
//         }
//         System.out.println("sum is "+sum);
        
//     }
// }


// Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix

public class day18_2Darrays {

    public static void main(String[] args) {
        int row = 2, col = 3;
        int[][] matrix = { {2,3,7}, {5,6,7} };
        printmatrix(matrix);

        int[][] transpose = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];

            }
        }
        printmatrix(transpose);

        
    }
    public static void printmatrix(int[][] matrix){
            System.out.println("the mstrix is: ");

            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    System.out.print(matrix[i][j]+"   ");
                }
                System.out.println();
            }
    }
}