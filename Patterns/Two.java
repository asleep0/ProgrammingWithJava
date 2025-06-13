package Patterns;
/*
 *        A B C D E
 *          F G H I
 *            J k L
 *              M N
 *                O
 */
public class Two {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
        

        
    }
    
}
