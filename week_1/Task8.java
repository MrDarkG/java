import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        Scanner var1=new Scanner(System.in);
        System.out.println("პირველი რიცხვი: ");
        String myvar1=var1.nextLine();
        try{
            int mynum=Integer.parseInt(myvar1);
        }
        catch (Exception e){
            System.exit(0);
        }
        Scanner var2=new Scanner(System.in);
        System.out.println("მეორე რიცხვი: ");
        String myvar2=var2.nextLine();
        try{
            int mynum1=Integer.parseInt(myvar2);
        }
        catch (Exception e){
            System.exit(0);
        }
        int num1=Integer.parseInt(myvar1);
        int num2=Integer.parseInt(myvar2);
        if(num1>num2){
            int num3;
            num3=num2;
            num2=num1;
            num1=num3;
        }
        for (int i=num1;i<=num2;i++){
            System.out.println(i);
        }
    }
}
