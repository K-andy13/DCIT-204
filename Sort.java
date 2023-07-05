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
            case 5:radixSortAlgo(j.getProblemArr());break;
            case 6:quickSortAlgo(j.getProblemArr());break;
            default:for(int p:SearchorSort.problemArr){System.out.println(p);}

        }
    }
    public static void bubbleSort(int[] arr){
BubbleSort bubbleSortObj=new BubbleSort();
bubbleSortObj.bubbleSort(arr);
 System.out.print("[");

    for(int i: arr){ System.out.print(i+","); }
      System.out.print("]");
    }

    public static void selectionSort(int[] T){
        SelectionSort selectionSortObject=new SelectionSort();
        selectionSortObject.sort(T);
 

    }
    public static void insertionSort(int[] T){
        InsertionSort insertionSortObj=new InsertionSort();
        insertionSortObj.insertionSort(T);
        System.out.println(Arrays.toString(T));

    }
    public static void radixSortAlgo(int[] arr){
      System.out.println("Original Array: " + Arrays.toString(arr));

        RadixSort radixSortObject=new RadixSort();
                radixSortObject.radixSortAlgo(arr);


 
}
    public static void quickSortAlgo(int[] T){
QuickSort quickSortObj=new QuickSort();
System.out.println("Original Array: " + Arrays.toString(T));
quickSortObj.quickSort(T, 0,T.length-1);
System.out.println("Sorted Array: " + Arrays.toString(T));


    }

     public static void mergeSort(int[] T){
MergeSort mergeSortObj=new MergeSort();
mergeSortObj.mergeSort(T);
for (int p : T) {
            System.out.print(p + ",");
        }
 }
}