class MergeSort {
    public static void main(String[] kwame) {
        MergeSort mergeSortObject = new MergeSort();
        int[] problem = {1, 5, 9, 5, 20, 17, 6, 3};
        mergeSortObject.mergeSort(problem);
        for (int p : problem) {
            System.out.print(p + ",");
        }
    }

    public void mergeSort(int[] problem) {
        int length = problem.length;
        if (length < 2) {
            return;
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        for (int i = 0; i < middle; i++) {
            leftArray[i] = problem[i];
        }

        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = problem[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, problem);
    }

    private void merge(int[] leftArr, int[] rightArr, int[] array) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                array[i] = leftArr[l];
                l++;
            } else {
                array[i] = rightArr[r];
                r++;
            }
            i++;
        }

        while (l < leftSize) {
            array[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
