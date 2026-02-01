

public class funoverloadingtype {
    // fun calcualte to integer
    public static int sum(int a,int b){
        return a+b;

    }
    // cal sum to float
    public static float sum(Float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        
        System.out.println(sum(2,6));
        System.err.println( sum(2.5f,4.7f));
    }
    
}
