public class SelectionSort {

    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the current element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
return array;
    }

    /*public static void main(String[] args) {
        int[] array = {103, 5, 2, 7, 39, 1, 9, 6, 4, 8};
        sort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
    }
