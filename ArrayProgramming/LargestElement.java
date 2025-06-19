class LargestElement{

    public static int LargestElement(int[] arr){


        // Method 1:-
        // sort the array
        // return arr[length-1]

        // Method 2 :-(optimal way)
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
        
    }
    public static void main(String[] args){

        int[] arr={55,69,15,8,44,98,95,2,74};
        System.out.println(LargestElement(arr));

    }

}