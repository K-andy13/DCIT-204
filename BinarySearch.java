public class BinarySearch{
   private int low=0;
 private   int high=SearchorSort.problemArr.length;
 private int mid;
    public void setHigh(int x){this.high=x;}
    public void setLow(int x){this.low=x;}



    public int binary(int[] arr, int key) {
SelectionSort selectionSortObj=new SelectionSort();
int[] sortedArray=selectionSortObj.sort(arr);

        if (high >= 1) {
            mid = (high + low) / 2;

            // If the element is present at the middle itself
            if (sortedArray[mid] == key)
                return mid;

            // If the element is smaller than mid, then
            // it can only be present in the left subarray
            if (sortedArray[mid] > key) {
                setHigh(mid - 1);
                return binary(sortedArray, key);
            }

            // Else the element can only be present
            // in the right subarray
            setLow(mid + 1);
            return binary(sortedArray, key);
        }

        // We reach here when the element is not present in the array
        return -1;
    }}