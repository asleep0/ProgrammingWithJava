package Patterns;

public class Four {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        int sum=n*(n+1)/2;
        ch=(char)(ch+(sum-1));

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
    
    
}
