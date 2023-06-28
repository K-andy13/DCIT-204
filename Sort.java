
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
            case 5:radixSort(j.getProblemArr());break;
            case 6:quickSort(j.getProblemArr());break;
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
    public static int[] radixSort(int[] T){
                //input implementation here

        return T;
    }
    public static int[] quickSort(int[] T){
                //input implementation here

        return T;
    }

     public static int[] mergeSort(int[] T){
                //input implementation here

        return T;
    }
}