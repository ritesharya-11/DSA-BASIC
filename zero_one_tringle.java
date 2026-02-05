public class zero_one_tringle {
    public static void tringle(int n){
        //outer loop
        for(int i =1; i<=n; i++ ){
            // inner loop 
            for(int j=1; j<=i; j++){
               if((i+j) %2 ==0){
                System.out.print("1");
               } else{
                System.out.println("0");
               }
            }
        }
    }
    public static void main(String[] args) {
        tringle(5);
        
    }
    
}
