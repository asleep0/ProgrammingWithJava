/*
 *  E D C B A 
 *    I H G F 
 *      L K J 
 *        N M 
 *          O 
 */
package Patterns;
public class Three{
    public static void main(String[] args) {
        char ch='A';
        int n=5;
        ch=(char)(ch+(n-1));

        for(int i=0;i<n;i++){
          
            
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            
            for(int j=0;j<n-i;j++){
                System.out.print(ch+" ");
               ch--;
            }
            ch=(char)(ch+(n-i)+(n-i-1));
            System.out.println();
        }

    }
}