


public class LargestArray {
    public static int BinarySearch(int numbers[],int key){
         int start = 0,end = numbers.length-1;

         while(start<=end){
            int mid = (start + end)/2;

            // compresikekeyon
            if(numbers[mid]==key){
                return  mid;
            }
            if(numbers[mid]<key){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
         }
           return -1;
    }
    
   public static void main(String[] args) {
       int numbers [] ={2,5,7,9,2,3,};
       int key = 10;
       System.out.println("index for key is " +BinarySearch(numbers, key));
   } 
    
}
