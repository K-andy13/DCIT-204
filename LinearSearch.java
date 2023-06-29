public class LinearSearch{

     public  void linearSearch(int[] T,int key){
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

}