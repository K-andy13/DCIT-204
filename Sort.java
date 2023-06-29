import java.util.Arrays;

class Sort{

    public static void intro(){
        System.out.println("Welcome to the world of sorting.What sorting algorithm would you like to use?\n\n(1) Bubble Sort\n(2) Selection Sort \n(3)Insertion Sort \n(4)Merge Sort\n(5)Radix Sort \n(6)Quicksort \n" );
    }

    public static void selectAlgo(int x){
             SearchorSort j=new SearchorSort();

        switch(x){
            case 1:bubbleSort(j.getProblemArr());break;
            case 2:selectionSort(j.getProblemArr());break;
            case 3:insertionSort(j.getProblemArr());break;
            case 4:mergeSort(j.getProblemArr());break;
            case 5:System.out.print("Original Array: ");
            System.out.print("[");
        for(int p:SearchorSort.problemArr){System.out.print(p +",");}
                System.out.print("]\n");
radixSortAlgo(j.getProblemArr());

        break;
            case 6:quickSortAlgo(j.getProblemArr());break;
            default:for(int p:SearchorSort.problemArr){System.out.println(p);}

        }
    }
    public static void bubbleSort(int[] arr){/*
//for(int p:arr){System.out.println(p);}
      int n = arr.length;
        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i);j++){
                if(arr[j-i]>arr[j]){
                    //swap elements

                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
       } 
       System.out.println("Sorted array: ");
       for(int p:arr){System.out.println(p);}

    */}

    public static void selectionSort(int[] T){
 int n = T.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted T
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (T[j] < T[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = T[i];
            T[i] = T[minIndex];
            T[minIndex] = temp;
        }

    System.out.println("Sorted T:");
    for(int p:T){System.out.println(p);}

    }
    public static int[] insertionSort(int[] T){
                //input implementation here

        return T;
    }
    public static void radixSortAlgo(int[] arr){
        
 // Find the maximum number to determine the number of digits
       

    int max = Arrays.stream(arr).max().getAsInt();

    // Perform counting sort for every digit
    for (int exp = 1; max / exp > 0; exp *= 10) {
      countingSort(arr, exp);
    }
  }

  // Counting Sort function to sort the array based on the digit at exp
  private static void countingSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];
    Arrays.fill(count, 0);

    // Count the occurrences of each digit in the input array
    for (int i = 0; i < n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    // Calculate the cumulative count array
    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    // Build the output array in sorted order
    for (int i = n - 1; i >= 0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    // Copy the sorted output array to the original array
    System.arraycopy(output, 0, arr, 0, n);
   System.out.println("Sorted Array: " + Arrays.toString(arr));

}
    public static int[] quickSortAlgo(int[] T){
                //input implementation here

        return T;
    }

     public static int[] mergeSort(int[] T){
                //input implementation here

        return T;
    }
}