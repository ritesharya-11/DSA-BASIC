public class printchar {
     
    public static void main(String[] args) {
        char ch = 'A';
        int n = 4;
        //outer loop
        for(int line=1; line<=4; line++){
            //inner loop
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
