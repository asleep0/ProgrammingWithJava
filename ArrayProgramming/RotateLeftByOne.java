public class RotateLeftByOne{

    public static int[] rotate(int []arr){
        int temp=arr[0];
        int i=1;
        while(i<arr.length){
            arr[i-1]=arr[i];
            i++;

        }
        arr[arr.length-1]=temp;

        return arr;
    }
public static void main(String[] args) {
    int []arr={1,2,3,4,5,6};
    arr=rotate(arr);
    for(int x:arr){
        System.out.println(x);
    }
    
}

}