public class functionoverloding {
     
   //fun to calculate of 2 sum
   public static int sum(int a,int b){
    return a+b;
   }
   // fun to calcualte of 3 sum
   public static int sum(int a, int b,int c){
    return a+b+c;
   }
    public static void main(String[] args) {
        System.out.println(sum(4,6));
         System.out.println(sum(4,7,7));
    }
}
