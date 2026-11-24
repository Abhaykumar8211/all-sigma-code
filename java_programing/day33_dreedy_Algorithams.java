// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

// public class day33_dreedy_Algorithams {
//     public static void main(String[] args) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         // 2D array -> {index, start, end}
//         int activities[][] = new int[start.length][3];

//         // store value
//         for(int i=0; i<start.length; i++){
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }

//         //sort by end time
//         Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));
        
//         // first activities select
//         int maxAct = 1;
//         ArrayList<Integer> ans = new ArrayList<>();

//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];

//         // check remaning activitie
//         for(int i=0; i<activities.length; i++){
//             if(activities[i][1] >= lastEnd){
//                 ans.add(activities[i][1]);
//                 maxAct++;
//                 lastEnd = activities[i][2];
//             }
//         }

//         // output
//         System.out.println("Maximum Activities = "+maxAct);
//         System.out.println("Selected Activities index = "+ans);
//     }
// }



// Fractional knapsack  -------------------------------------------?

// import java.util.Arrays;
// import java.util.Comparator;

// public class day33_dreedy_Algorithams {

//     public static void main(String[] args) {
//         int val[] = {60, 100, 120};
//         int weight[] = {10, 20, 30};
//         int w = 50;

//         double ratio[][] = new double[val.length][2];
//         // 0th col => idx; 1st => ratio

//         for(int i=0; i<val.length; i++){
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         // ascending order
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = w;
//         int finalval = 0;
//         for(int i=ratio.length-1; i>=0; i--){
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]){  //include full item
//                 finalval += val[idx];
//                 capacity -= weight[idx];
//             }else{
//                 // include fraction item
//                 finalval += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }
//         System.out.println("final value = "+finalval);
//     }
// }


// find min Absolute Diiference pairs ----------------------------------?

// import java.lang.reflect.Array;
// import java.util.Arrays;

// public class day33_dreedy_Algorithams {

//     public static void main(String[] args) {
//         int A[] = {1, 2, 3};
//         int B[] = {2, 1, 3};

//         Arrays.sort(A);
//         Arrays.sort(B);

//         int minDiff = 0;

//         for(int i=0; i<A.length; i++){
//             minDiff += Math.abs(A[i]-B[i]);
//         }
//         System.out.println("min absolute of pairs = "+minDiff);
//     }
// }



// Max length chain of pairs ------------------?

// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Comparator;

// public class day33_dreedy_Algorithams {

//     public static void main(String[] args) {
//         int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        
//         int chainlen = 1;
//         int chainEnd = pairs[0][1]; // last selected pair end chain end

//         for(int i=0; i<pairs.length; i++){
//             if(pairs[i][0] > chainEnd){
//                 chainlen++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.println("max lenght of chain = "+chainlen);

//     }
// }



// indian Coins -------------------------------------------------------?

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Comparator;

// public class day33_dreedy_Algorithams {
//     public static void main(String[] args) {
//         Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

//         Arrays.sort(coins, Comparator.reverseOrder());

//         int countofCoins = 0;
//         int amount  = 590;
//         ArrayList<Integer> ans = new ArrayList<>();

//         for(int i=0; i<coins.length; i++){
//             if(coins[i] <= amount){
//                 while(coins[i] <= amount){
//                     countofCoins++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }

//         }
//         System.out.println("total (min) coins used = "+countofCoins);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print(ans.get(i)+" ");
//         }
//         System.err.println();
        
//     }
// }




// Job Sequencing Problem - Greedy  ------------------------------------?
// import java.util.*;

// class Job {
//     int id;
//     int deadline;
//     int profit;

//     public Job(int i, int d, int p) {
//         id = i;
//         deadline = d;
//         profit = p;
//     }
// }

// public class day33_dreedy_Algorithams {
//     public static void main(String[] args) {

//         // jobsInfo = {deadline, profit}
//         int jobsInfo[][] = {
//                 {4, 20},
//                 {1, 10},
//                 {1, 40},
//                 {1, 30}
//         };

//         // Step 1: Convert into Job objects
//         ArrayList<Job> jobs = new ArrayList<>();

//         for (int i = 0; i < jobsInfo.length; i++) {
//             jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
//         }

//         // Step 2: Sort jobs by profit (descending)
//         Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

//         // Step 3: Greedy selection
//         ArrayList<Integer> seq = new ArrayList<>();
//         int time = 0;

//         for (int i = 0; i < jobs.size(); i++) {
//             Job curr = jobs.get(i);

//             if (curr.deadline > time) {
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         // Step 4: Print result
//         System.out.println("Max jobs = " + seq.size());

//         for (int i = 0; i < seq.size(); i++) {
//             System.out.print(seq.get(i) + " ");
//         }

//         System.out.println();
//     }
// }



// chocola problem -------------------------------------------------------?

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class day33_dreedy_Algorithams {

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1
        Integer costHor[] = {4, 1, 2};  //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length){
            if(costVer[v] <= costHor[h]) {  //horizonatal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while ((h < costHor.length)) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;

        }
        System.out.println("min cost of cut = "+cost);
    }
}