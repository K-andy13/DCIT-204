class Search{
    public static void intro(){
        System.out.println("Welcome to the world of searching.\nWhat searching algorithm would you like to use?\n\n(1)Linear Search\n(2) Binary\n");
    }

     public static void selectAlgo(int x){
             SearchorSort j=new SearchorSort();

        switch(x){
            case 1:linearSearch(j.getProblemArr(),j.searchKey);
            break;
            case 2:binarySearch(j.getProblemArr());break;
            default:for(int p:SearchorSort.problemArr){System.out.println(p);}

        }}

   

    public static void linearSearch(int[] T,int key){
        System.out.println("Search key: "+key);

        

int finds=0;
            for(int p=0;p<T.length;p++){
                if(T[p]==key){finds++;
                    System.out.println("Key found at index "+p);
            }
            }

            if(finds<1){   System.out.println("Array does not contain the search key");
}
            
        }
    

        public static int binarySearch(int[] T){
            //insert implementation heres
            int soln=0;//assign index of your found key to soln or -1 if key is not found,0 is just a placeholder
            System.out.println(soln);
            return soln;}
}