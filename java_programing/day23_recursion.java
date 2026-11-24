// public class day23_recursion {
//     public static int boardtiles(int n){
//         // base case
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         // kaam vertical choise
//         int fnm1 = boardtiles(n - 1);
//         // horijontal choise
//         int fnm2 = boardtiles(n - 2);

//         int totalways = fnm1 + fnm2;
//         return totalways;
//     }
//     public static void main(String msin[]){
//         int n = 2;
//         System.out.println(boardtiles(n));

//     }
    
// }


// remove duplicate in String
// public class day23_recursion {
//     // Corrected signature: Added boolean[] map parameter
//     public static void remdubStr(String str, int idx, StringBuilder newstr, boolean[] map){
//         if(idx == str.length()){
//             System.out.println(newstr);
//             return;
//         }

//         char currchar = str.charAt(idx);
//         if(map[currchar - 'a'] == true){
//             // Recursive call to next index
//             remdubStr(str, idx + 1, newstr, map);
//         }else{
//             map[currchar - 'a'] = true;
//             // Append and recurse
//             remdubStr(str, idx + 1, newstr.append(currchar), map);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         // Initialize boolean map for 'a'-'z' and StringBuilder
//         remdubStr(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }


// pairs frend
// public class day23_recursion {
//     public static int pairfriends(int n){
//         if(n == 1 || n == 2){
//             return n;
//         }
//         // int fnm1 = pairfriends(n - 1);
//         // int fnm2 = pairfriends(n - 2);
//         // int pairways = (n-1) * fnm2;
//         // int totalways = fnm1 + pairways;
//         // return totalways;

//         // ak me bhi likh sakte hai
//         return pairfriends(n-1) + (n-1)*pairfriends(n-2);

//     }

//     public static void main(String[] args) {
//         int n = 2;
//         System.out.println(pairfriends(n));
//     }
// }


public class day23_recursion {
    public static void printbinary(int n, int lastplace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printbinary(n-1, 0, str+"0");
        if(lastplace == 0){
            printbinary(n-1, 1,str+"1");
        }
    }
    public static void main(String[] args) {
        printbinary(3, 0, "");
        
    }
}