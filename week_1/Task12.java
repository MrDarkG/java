import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Task12 {
    public static void main(String args[]){
        int[] array=new int[8];
        Random rand=new Random();
        for(int i=0;i<8;i++){
            array[i]=rand.nextInt(100);
        }
        Arrays.sort(array);
        int[] sorted_array=new int[8];
        int c=0;
        for (int i=array.length-1;i>=0;i--){
            sorted_array[c]=array[i];
            c+=1;
        }
        System.out.println(Arrays.toString(sorted_array));
    }
}
