public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18};

        int target=15;

        System.out.println("Ceiling of number: " + ceilingOfNumber(arr, target));
    }

    public static int ceilingOfNumber(int[] arr,int target){
        int s=0,e=arr.length-1,ans=-1;
        if(target > arr[arr.length-1])
            return ans;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]==target ){
                ans =mid;
                return ans;
            }else{
                if(target > arr[mid]){
                    s=mid+1;
                }else{
                    e =mid-1;
                }
            }
        }
        if(s>e){
            ans=s;
        }
        return ans;


        //In this commented code there might be it give arrayindexoutofboundException

        // while(s<=e){
        //     int mid =s+(e-s)/2;
        //     if(  arr[mid]>=target &&  arr[mid-1] < target){
        //         ans=mid;
        //         return ans;
        //     }else{
        //         if(target > arr[mid]){
        //             s=mid+1;
        //         }else{
        //             e =mid-1;
        //         }
        //     }
        // }
        // return ans;
    }
}
