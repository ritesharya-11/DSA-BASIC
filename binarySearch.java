public class binarySearch {

    public static int binary(int number[],int key){
     int start = 0, end = number.length - 1; 
         while(start<=end){
            int mid = (start+end)/2;


            // compression
            if(number[mid]==key){
                return  mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
         }
         return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,7,9,11};

        int key = 9;
        System.out.println("index for key"+binary(numbers, key));
    }
    
}
