// public class day3 {
//     public static void main(String[] args) {
//         int rows = 4;
//         int cols = 5;
//         for(int line=1; line<=rows; line++){
//             for(int star=1; star<=cols; star++){
//                 if(line == 1 || line == rows || star == 1 || star == cols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.err.println();
//         }
        
//     }
// }

public class day12{
    public static void main(String args[]){
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line; star++){
                System.out.print(" ");
            }
            for(int star1=1; star1<=line; star1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







