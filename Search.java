class Search{
    public static void intro(){
        System.out.println("Welcome to the world of searching.\nWhat searching algorithm would you like to use?\n\n(1)Linear Search\n(2) Binary\n");
    }

     public static void selectAlgo(int x){
             SearchorSort j=new SearchorSort();

        switch(x){
            case 1:linearSearch(j.getProblemArr(),SearchorSort.searchKey);
            break;
            case 2:binarySearch(j.getProblemArr(),SearchorSort.searchKey);break;
            default:for(int p:SearchorSort.problemArr){System.out.println(p);}

        }}

   

    public static void linearSearch(int[] T,int key){
        LinearSearch linearSearchObject=new LinearSearch();
               linearSearchObject.linearSearch(T,key);

            
        }
    

        public static void binarySearch(int[] arr,int key){
            BinarySearch binarySearchobject=new BinarySearch();
            System.out.println("Index of key is ");
System.out.print(binarySearchobject.binary(arr, key));
             
}
}