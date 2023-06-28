
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
    public static int[] bubbleSort(int[] T){
        //input implementation here
        return T;
    }

    public static int[] selectionSort(int[] T){
                //input implementation here

        return T;
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