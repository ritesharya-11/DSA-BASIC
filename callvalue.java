public class callvalue {

    // public static void swap(int a, int b){

    //     // swap
    //     int temp =a;
    //     a=b;
    //     b=temp;

    //     System.out.println(a);
    //     System.out.println(b);
    // }
    // public static int multiply(int a, int b){
    //      int product = a*b;
    //      return product;

         
    // }

    // public static void main(String[] args) {
    //     int a= 4;
    //     int b= 6;
    //     int product = multiply(a, b);
    //     System.out.println("a*b="+product);

    // }
   
    public static int factorial(int n){

        int f =1;
        for(int i= 1; i<=n; i++){
            f = f*i;

        }
        return f;
    }
    public static int binCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r =factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoff = fact_n/(fact_r*fact_nmr);
        return binCoff;
    }
    public static void main(String[] args) {
        
        System.out.println(binCoff(5,7));
    }
        
    }

    

