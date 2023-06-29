 class BubbleSort{
    

public static void main(String[] args){
    
    int array[] = {3,60,35,2,45,320,5};

    bubbleSort(array);
        System.out.print("[");

    for(int i: array){ System.out.print(i+","); }
      System.out.print("]");

}
    public static void bubbleSort(int array[]){
        for(int i=0; i< array.length - 1; i++){
            for(int j=0; j< array.length -i - 1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}