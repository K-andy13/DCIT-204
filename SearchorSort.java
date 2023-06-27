import java.util.Scanner;
class SearchorSort{
    private String intro="Hello,this application allows you to perform searcing or sorting algorithms on problems you give it.\n";
private String intro2="What would you like to do? \n (1)search \n (2) sort\n";

    public static void main(String[] kwame){
SearchorSort x=new SearchorSort();
        System.out.println(x.intro);
        System.out.println(x.intro2);
Scanner scan =new Scanner(System.in);
int searchOrSort=scan.nextInt();
System.out.println(searchOrSort);
scan.close();

if(searchOrSort==1){Search.intro();}
else{Sort.intro();}
 
    }
}