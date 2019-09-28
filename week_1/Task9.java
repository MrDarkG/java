public class Task9 {
    public static void main(String[] args){
        int[] array={12,34,123,5,6,7,128,1};
        int array_min=array[0];
        int array_max=array[0];
        for (int i:array){
            if(array_min>i){
                array_min=i;
            }
            if(array_max<i){
                array_max=i;
            }
            System.out.println(i);

        }
        System.out.println("უდიდესი რიცხვია: "+array_max);
        System.out.println("უმცირესი რიცხვია: "+array_min);
    }
}
