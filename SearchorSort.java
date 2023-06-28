import java.util.Scanner;
class SearchorSort{
    public int problemSize=0;
    private String intro="Hello,this application allows you to perform searcing or sorting algorithms on problems you give it.\n";
    private String pSize="First enter the size of your problem instance.\n";
    private String enterProb="Now enter your problem.\n";
public static int[] problemArr;
public int[] getProblemArr(){return problemArr;}

    public void setProbSize(int x){this.problemSize=x;
    }    


private String chooseOperation="What would you like to do? \n (1)search \n (2) sort\n";

    public static void main(String[] kwame){
SearchorSort x=new SearchorSort();
Scanner scan =new Scanner(System.in);

        System.out.println(x.intro);
        System.out.println(x.pSize);
        //accepting user input for problem size
        x.setProbSize(scan.nextInt());
        //test to see if problem size variable assignment works
       // System.out.println(SearchorSort.problemSize);

        System.out.println(x.enterProb);
        x.problemArr=new int[x.problemSize];
        int index=0;
        //loop to get elements in our problem array
        while(index<x.problemSize){
            x.problemArr[index]=scan.nextInt();
            index++;
        }

        /*test to see if array is properly filled
        int y=0;
        while(y<x.problemSize){
          System.out.println(x.problemArr[y]);
            y++;}*/
        

        System.out.println(x.chooseOperation);



int searchOrSort=scan.nextInt();

if(searchOrSort==1){Search.intro();
Search.selectAlgo(scan.nextInt());}

else{Sort.intro();
Sort.selectAlgo(scan.nextInt());}
 
    }
}