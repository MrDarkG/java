import java.util.Scanner;
public class Task5 {
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
        int sum=0;
        for(char c:myvar1.toCharArray()){
            int cc=Integer.parseInt(String.valueOf(c));

            sum+=cc;
        }
        System.out.println(sum);
    }
}
