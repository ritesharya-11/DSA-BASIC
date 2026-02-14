public class Largest {
    public static int getLargest(int numbers[]){
        int largest =Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest =numbers[i];
            }
            
        }
        
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,3,7,2,8,5};
        System.out.println("print largest number"+getLargest(numbers));
        // System.out.println("smallest number is" +smallest(numbers));
    }
    
}
