public class RemoveDuplicates {
    
    public static int removeDuplicates(int[] arr){
        
        // Method 1
        /* 
        int n=arr.length;
        int counter=1;
        int i=0,j=0;
        int []uniqueArr=new int[n];
        uniqueArr[0]=arr[0];
        while(i<n){
            if(arr[i]!=uniqueArr[j]){
                j++;
                uniqueArr[j]=arr[i];
                i++;
                counter++;
            }else{
                i++;
            }
        }
*/

// Method 2:-
int n=arr.length;
int i=0,j=1;

while(j<n){
    if(arr[i]!=arr[j]){
        i++;
        arr[i]=arr[j];
        j++;
    }else{
        j++;
    }
}
    return i+1;
    }
    public static void main(String[] args) {
        int []arr={1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
}
