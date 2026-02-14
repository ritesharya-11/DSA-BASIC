import java.util.*;

public class linear {
    public static void linearSearch(int numbers[],int key){
        for(int i =0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }

        return-1;
    }
     public static void main(String[] args) {
         int numbers[] = {3,5,7,10,17,5};
         int key = 10;

         int index = linearSearch(numbers, key);
         System.out.println("key is at index");
     }


}
