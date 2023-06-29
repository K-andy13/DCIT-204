import java.util.Arrays;

public class InsertionSort {
    public static  void main(String[] arg){
        int array[] = {9,1,8,2,7,6,3,5,4};
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array){

        for (int i=1; i<array.length; i++){
            int temp = array[i];
            int j = i -1;

            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
