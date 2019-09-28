import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner myvar= new Scanner(System.in);
        System.out.println("Sheiyvanet otxnishna ricxvi");
        String myvar1=myvar.nextLine();
        try{
            int mynum=Integer.parseInt(myvar1);
        }
        catch (Exception e){
            System.exit(0);
        }
        int mynum=Integer.parseInt(myvar1);
        if(mynum<1000 || mynum>9999){
            System.exit(0);
        }
        for(char c:myvar1.toCharArray()){
            System.out.println(c);
        }
    }
}
