import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner myvar1= new Scanner(System.in);
        System.out.println("Num1= ");
        String num1=myvar1.nextLine();

        try{
            int numb1=Integer.parseInt(num1);
        }
        catch (Exception e){
            System.out.println("provide valid number in num1");
            System.exit(0);

        }
        Scanner myvar2=new Scanner(System.in);
        System.out.println("Num2= ");
        String num2=myvar2.nextLine();
        try{
            int numb2=Integer.parseInt(num2);
        }
    catch (Exception e){
        System.out.println("provide valide number in num2");
        System.exit(0);
    }
    int numb2=Integer.parseInt(num2);
    int numb1=Integer.parseInt(num1);
    System.out.println("num1/num2="+ numb1/numb2);
    System.out.println("num2%num1="+ numb2%numb1);

    }
}
