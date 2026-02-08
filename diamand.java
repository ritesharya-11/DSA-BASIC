public class diamand {

    public static void diamond(int n){
        // outer loop
        for(int i =1; i<=n; i++){
            //space
            for(int j =1;j<=n-1; j++){
                System.out.print("");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.println(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
        
    }
}