import java.util.*;
class Search{
    public static void intro(){
        System.out.println("Welcome to the world of searching.\nWhat searching algorithm would you like to use?\n\n(1)Linear Search\n(2) Binary\n");
    }

     public static void selectAlgo(int x){
             SearchorSort j=new SearchorSort();

        switch(x){
            case 1:linearSearch(j.getProblemArr());
            break;
            case 2:binarySearch(j.getProblemArr());break;
            default:for(int p:SearchorSort.problemArr){System.out.println(p);}

        }}

   

    public static int linearSearch(int[] T){
        //insert implemetation here
        int soln=0;//assign index of your found key to soln or -1 if key is not found,0 is just a placeholder
        System.out.println(soln);

        return soln;}

        public static int binarySearch(int[] T){
            //insert implementation heres
            int soln=0;//assign index of your found key to soln or -1 if key is not found,0 is just a placeholder
            System.out.println(soln);
            return soln;}
}