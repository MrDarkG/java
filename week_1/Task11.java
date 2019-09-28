import java.util.Random;
import java.util.Arrays;

public class Task11 {
    public static void main(String args[]){
        int[] array=new int[8];
        Random rand=new Random();
        for(int i=0;i<8;i++){
            array[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
    }
}
