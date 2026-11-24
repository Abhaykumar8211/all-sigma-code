// import java.util.Scanner;

// public class day19_String {
//     public static void main(String[] args) {
//         String str = new Scanner(System.in).next();
//         int count = 0;
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 count++;
//             }
//         }
//         System.out.println("count of vowels is :"+count);
//     }
    
// }


// public class day19_String {

//     public static void main(String[] args) {
//         String str = "shardhadidi";
//         String str1 = "apnacollege";
//         String str2 = "shardhadidi";
//         System.out.println(str.equals(str1)+ " " +str.equals(str2));
//     }
// }



// public class day19_String {

//     public static void main(String[] args) {
//         String str = "ApnaCollege".replace("1", "");
//         System.out.println(str);
//     }
// }



import java.util.Arrays;

public class day19_String {
    public static void main(String[] args) {

        String str1 = "race";
        String str2 = "care";

        // Step 1: lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 2: length check
        if(str1.length() == str2.length()){

            // Step 3: convert to char array
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Step 4: sort
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Step 5: compare
            if(Arrays.equals(arr1, arr2)){
                System.out.println("Strings are Anagrams");
            } else {
                System.out.println("Strings are NOT Anagrams");
            }

        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}
