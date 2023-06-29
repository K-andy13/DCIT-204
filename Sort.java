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
        SelectionSort selectionSortObject=new SelectionSort();
        selectionSortObject.sort(T);
 

    }
    public static int[] insertionSort(int[] T){
                //input implementation here

        return T;
    }
    public static void radixSortAlgo(int[] arr){
        RadixSort radixSortObject=new RadixSort();
                radixSortObject.radixSortAlgo(arr);

 
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