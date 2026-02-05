public class flody {
    public static void flody_tringle(int n){
        // outer loop
        int counter = 1;
        for(int i=1; i<=n; i++){
            //inner loop- how many time will be counter print
            for( int j=1; j<=i; j++){
                System.out.print(counter+" ");

            }
            System.out.println();
        
        
        }
    }
    public static void main(String[] args) {
        flody_tringle(5);
        
    }
    
}
