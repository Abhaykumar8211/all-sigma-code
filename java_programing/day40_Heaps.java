// import java.util.PriorityQueue;
// public class day40_Heaps {
//     public static void main(String args[]){
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(3); //O(logn)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());  //O(1)
//             pq.remove();  // o(logn)
//         }
//     }
    
// }

// reverse Order 
// import java.util.Comparator;
// import java.util.PriorityQueue;
// public class day40_Heaps {
//     public static void main(String args[]){
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3); //O(logn)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());  //O(1)
//             pq.remove();  // o(logn)
//         }
//     }
    
// }


// import java.util.Comparator;
// import java.util.PriorityQueue;
// public class day40_Heaps {

//     static class student implements Comparable<student> {
//         String name;
//         int rank;

//         public student(String name, int rank){
//             this.name = name;
//             this.rank = rank;

//         }

//         @Override
//         public int compareTo(student s2){
//             return this.rank - s2.rank;
//         }
//     }
//     public static void main(String args[]){
//         PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(new student("A", 4)); //O(logn)
//         pq.add(new student("B", 5));
//         pq.add(new student("C", 2));
//         pq.add(new student("D", 12));

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name +"->"+pq.peek().rank);  //O(1)
//             pq.remove();  // o(logn)
//         }
//     }
// }



// min heap heaps -----------------------------------------------------?

// import java.util.ArrayList;

// public class day40_Heaps {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {  // O(log n)
//             //add at last idx
//             arr.add(data);

//             int x = arr.size()-1;  //x is child index
//             int par = (x-1)/2;  //par index

//             while(arr.get(x) < arr.get(par)) {  //o(log n)
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         public int peek() {
//             return arr.get(0);
//         }

//         private void heapify(int i){
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int minIdx = i;

//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
//                 minIdx = right;
//             }

//             if(minIdx != i){
//                 //swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }
//         }

//         public int remove() {
//             int data = arr.get(0);

//             //step1 - swap first nad last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             //step2 - delete last
//             arr.remove(arr.size()-1);

//             //step3 - heapify
//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String[] args) {
//         Heap pq = new Heap();
//         pq.add(3);
//         pq.add(4);
//         pq.add(1);
//         pq.add(5);

//         while(!pq.isEmpty()){   //Heap sort
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }



// Max Heap ------------------------------------------------?
// import java.util.ArrayList;

// public class day40_Heaps {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {  // O(log n)
//             //add at last idx
//             arr.add(data);

//             int x = arr.size()-1;  //x is child index
//             int par = (x-1)/2;  //par index

//             while(arr.get(x) > arr.get(par)) {  //o(log n)
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         public int peek() {
//             return arr.get(0);
//         }

//         private void heapify(int i){
//             int left = 2*i+1;
//             int right = 2*i+2;
//             int maxIdx = i;

//             if(left < arr.size() && arr.get(maxIdx) < arr.get(left)){
//                 maxIdx = left;
//             }

//             if(right < arr.size() && arr.get(maxIdx) < arr.get(right)){
//                 maxIdx = right;
//             }

//             if(maxIdx != i){
//                 //swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(maxIdx));
//                 arr.set(maxIdx, temp);

//                 heapify(maxIdx);
//             }
//         }

//         public int remove() {
//             int data = arr.get(0);

//             //step1 - swap first nad last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             //step2 - delete last
//             arr.remove(arr.size()-1);

//             //step3 - heapify
//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String[] args) {
//         Heap pq = new Heap();
//         pq.add(3);
//         pq.add(4);
//         pq.add(1);
//         pq.add(5);

//         while(!pq.isEmpty()){  // Heap sort
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }



// HeapSort max (assending Order)----------------------------------------------?
// public class day40_Heaps {
//     public static void heapify(int arr[], int i, int size){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int maxIdx = i;

//         if(left < size && arr[left] > arr[maxIdx]){
//             maxIdx = left;
//         }

//         if(right < size && arr[right] > arr[maxIdx]){
//             maxIdx = right;
//         }

//         if(maxIdx !=i){
//             // swap
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, size);

//         }

//     }

//     public static void heapSort(int arr[]){
//         //step1 - buils maxHeap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--){
//             heapify(arr, i, n);
//         }

//         //step2 - push largest at end
//         for(int i=n-1; i>0; i--){
//             //swap
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 4, 5, 3};
//         heapSort(arr);

//         //print
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();
//     }
// }




// HeapSort min Heap (disending Order) ---------------------------------?
// public class day40_Heaps {
//     public static void heapify(int arr[], int i, int size){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int minIdx = i;

//         if(left < size && arr[left] < arr[minIdx]){
//             minIdx = left;
//         }

//         if(right < size && arr[right] < arr[minIdx]){
//             minIdx = right;
//         }

//         if(minIdx !=i){
//             // swap
//             int temp = arr[i];
//             arr[i] = arr[minIdx];
//             arr[minIdx] = temp;

//             heapify(arr, minIdx, size);

//         }

//     }

//     public static void heapSort(int arr[]){   //O(n*logn)
//         //step1 - buils maxHeap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--){
//             heapify(arr, i, n);
//         }

//         //step2 - push largest at end   
//         for(int i=n-1; i>0; i--){
//             //swap
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 4, 5, 3};
//         heapSort(arr);

//         //print
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");

//         }
//         System.out.println();
//     }
// }



// Nearby cars ------------------------------------------------------?

// import java.util.PriorityQueue;

// public class day40_Heaps {
//     static class point implements Comparable<point> {
//         int x;
//         int y;
//         int distsq;
//         int idx;

//         public point(int x, int y, int distsq, int idx) {
//             this.x = x;
//             this.y = y;
//             this.distsq = distsq;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(point p2) {
//             return this.distsq - p2.distsq;
//         }
//     }

//     public static void main(String args[]){
//         int pts[][] = {{3 ,3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<point> pq = new PriorityQueue<>();
//         for(int i=0; i<pts.length; i++){
//             int distpq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new point(pts[i][0], pts[i][1], distpq, i));
//         }

//         //nearest K cars
//         for(int i=0; i<k; i++){
//             System.out.println("C"+pq.remove().idx);
//         }
//     }
// }




// Connect N ropes -------------------------------------------------------?

// import java.util.PriorityQueue;

// public class day40_Heaps {

//     public static void main(String[] args) {
//         int ropes[] = {2, 3, 3, 4, 6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int i=0; i<ropes.length; i++){
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while ((pq.size() > 1)) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost += min + min2;
//             pq.add(min+min2);
//         }

//         System.out.println("Cost of connection n ropes = "+ cost);
//     }
// }



// Weakness define ----------------------------------------?

// import java.util.PriorityQueue;

// public class day40_Heaps {
//     static class row implements Comparable<row> {
//         int soldiers;
//         int idx;

//         public row (int soldiers, int idx){
//             this.soldiers = soldiers;
//             this.idx = idx;

//         }

//         @Override
//         public int compareTo(row r2){
//             if(this.soldiers == r2.soldiers){
//                 return this.idx - r2.idx;
//             }else{
//                 return this.soldiers - r2.soldiers;
//             }
//         }
         
//     }

//     public static void main(String[] args) {
//          int army[][] = {
//             {1, 0, 0, 0},
//             {1, 1, 1, 1},
//             {1, 0, 0, 0},
//             {1, 0, 0, 0}
//         };
//         int k = 2;

//         PriorityQueue<row> pq = new PriorityQueue<>();

//         for(int i=0; i<army.length; i++){
//             int count = 0;
//             for(int j=0; j<army[0].length; j++) {
//                 count += army[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new row(count, i));
//         }

//         for(int i=0; i<k; i++){
//             System.out.println("R"+pq.remove().idx);
//         }
//     }
// }


// Sliding  window maximum ----------------------------------------?

import java.util.PriorityQueue;

public class day40_Heaps {
    static class pair implements Comparable<pair> {
        int val;
        int idx;

        public pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(pair p2){
            //assending
            // return this.val - p2.val;
            // descending
            return p2.val - this.val;
        }
    }

    public static void main(String args[]){
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length-k+1]; //n-k+1

        PriorityQueue<pair> pq = new PriorityQueue<>();

        // 1st window
        for(int i=0; i<k; i++){
            pq.add(new pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for(int i=k; i<arr.length; i++){
            while(pq.size() > 0 && pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        // print
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}