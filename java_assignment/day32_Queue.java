// Given a number n the task is to generae and print all binary numbers with decimal values from 1 to n
// import java.util.LinkedList;
// import java.util.Queue;

// public class day32_Queue {
//     public static void binariprint(int n){
//         Queue<String> q = new LinkedList<String>();
//         q.add("1");

//         while (n-->0) {
//             String s1 = q.peek(); 
//             q.remove();
//             System.out.print(s1 + " ");
//             String s2 = s1;

//             q.add(s1 + "0");
//             q.add(s2 + "1");
//         }
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         binariprint(n);
//     }
// }



// question -> 2

// import java.util.PriorityQueue;

// public class day32_Queue {
//     static int mincost(int arr[], int n){
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int i = 0; i<n; i++){
//             pq.add(arr[i]);
//         }

//         int res = 0;

//         while(pq.size() > 1){
//             int first = pq.poll();
//             int second = pq.poll();

//             int sum = first + second;
//             res += sum;

//             pq.add(sum);
//         }
//         return res;
//     }

//     public static void main(String args[]){
//         // int arr[] = {4, 3, 2, 6};  -> 29
//         int arr[] = {1, 2, 3};
//         int n = arr.length;

//         int result = mincost(arr, n);

//         System.out.println("Total cost for connecting ropes is "+result);

//     }
// }


// Solution 3 ----------------------------------------------------------?
// import java.util.*;

// public class day32_Queue {

//     static class Job {
//         char job_id;
//         int deadline;
//         int profit;

//         Job(char job_id, int deadline, int profit) {
//             this.job_id = job_id;
//             this.deadline = deadline;
//             this.profit = profit;
//         }
//     }

//     static void printJobScheduling(ArrayList<Job> arr) {
//         int n = arr.size();

//         // Sort jobs according to deadline
//         Collections.sort(arr, (a, b) -> a.deadline - b.deadline);

//         ArrayList<Job> result = new ArrayList<>();

//         // Max Heap based on profit
//         PriorityQueue<Job> maxHeap =
//                 new PriorityQueue<>((a, b) -> b.profit - a.profit);

//         // Traverse from last job
//         for (int i = n - 1; i >= 0; i--) {

//             int slot_available;

//             if (i == 0) {
//                 slot_available = arr.get(i).deadline;
//             } else {
//                 slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
//             }

//             // Add current job to heap
//             maxHeap.add(arr.get(i));

//             // Fill slots with highest profit jobs
//             while (slot_available > 0 && !maxHeap.isEmpty()) {
//                 Job job = maxHeap.poll();
//                 result.add(job);
//                 slot_available--;
//             }
//         }

//         // Sort result by deadline
//         Collections.sort(result, (a, b) -> a.deadline - b.deadline);

//         // Print jobs
//         for (Job job : result) {
//             System.out.print(job.job_id + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         ArrayList<Job> arr = new ArrayList<>();

//         arr.add(new Job('a', 2, 100));
//         arr.add(new Job('b', 1, 19));
//         arr.add(new Job('c', 2, 27));
//         arr.add(new Job('d', 1, 25));
//         arr.add(new Job('e', 3, 15));

//         System.out.println("Following is maximum profit sequence of jobs:");
//         printJobScheduling(arr);
//     }
// }



// question - 4 -------------------------------------------------?
// import java.util.*;

// public class day32_Queue{

//     static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

//         if (q.isEmpty() || k > q.size()) {
//             return q;
//         }

//         Stack<Integer> st = new Stack<>();

//         // Step 1: first k elements stack me daalo
//         for (int i = 0; i < k; i++) {
//             st.push(q.poll());
//         }

//         // Step 2: stack se wapas queue me daalo (reverse ho jayega)
//         while (!st.isEmpty()) {
//             q.add(st.pop());
//         }

//         // Step 3: remaining elements ko rotate karo
//         int size = q.size();
//         for (int i = 0; i < size - k; i++) {
//             q.add(q.poll());
//         }

//         return q;
//     }

//     public static void main(String[] args) {

//         Queue<Integer> q = new LinkedList<>();

//         int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

//         for (int x : arr) {
//             q.add(x);
//         }

//         int k = 5;

//         q = reverseFirstK(q, k);

//         System.out.println(q);
//     }
// }




// question - 5 ---- --------------------------------------------?
import java.util.Deque;
import java.util.LinkedList;

public class day32_Queue {

    static void printMax(int arr[], int n, int k) {

        Deque<Integer> Qi = new LinkedList<>();

        int i;

        // First window
        for (i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Remaining elements
        for (; i < n; ++i) {

            // Print max of previous window
            System.out.print(arr[Qi.peek()] + " ");

            // Remove elements out of this window
            while (!Qi.isEmpty() && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }

            // Remove smaller elements
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            Qi.addLast(i);
        }

        // Print max of last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        printMax(arr, arr.length, k);
    }
}