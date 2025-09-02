import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        
        char [] array=a.toCharArray();
        for(char ch:array){
            System.out.println(ch+" ");
        }
        
    }
}