public class SecondLargest {


    public static int secondLargest(int[] arr){
        int largest=-1;
        int secondLargest=-2;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                if(secondLargest!=largest){
                    secondLargest=largest;
                        largest=arr[i];
                     
                }else if(arr[i]>secondLargest&&arr[i]!=largest){
                    secondLargest=arr[i];
                }

            
               
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        
        int[] arr={55,69,15,8,44,98,95,2,74};
        System.out.println(secondLargest(arr));

    }
}
