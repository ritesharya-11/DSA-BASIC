public class  Rectangle{

// public static void hollow_rectangle (int totRow, int totCols){
//     // outer loop
//     for(int i=1; i<=totRow; i++){
//         // inner colums
//         for(int j=1; j<=totCols; j++){
//             //cell -(i,j)
//             if(i==1 || i == totRow || j == 1 || j ==totCols){
//                 // boundry line
//                System.out.print("*");
//             }else{
//                 System.out.println(" ");
//             }
//         }
//          System.out.println();
//     }
// }

 public static void half_pyamid(int n){
    // outer loop
    for(int i = 1; i<=1; i++){
        //spaces
        for(int j=1; j<=n-1; j++){
            System.out.print(" ");
        }
        // stars
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println("");
    }

 }
public static void main(String[] args) {
    // hollow_rectangle(4, 5);
    half_pyamid(4);
        
    }
    
}