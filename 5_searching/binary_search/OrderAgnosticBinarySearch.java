public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        // int[] arr ={-12,-4,-1,0,1,2,6,7,8,9};
        int[] arr ={9,8,7,6,2,1,0,-1,-4,-12};
        int target =2;

        //Order Agnostic Binary Search Code
        //if flag true array is ascending //false if array is descending
        boolean flag =arr[0] < arr[arr.length-1];
       

        int res=orderAgnosticBinarySearch(arr, 0, arr.length -1, target,flag);
        System.out.println(target+" found in index : "+res);
    }

    static int orderAgnosticBinarySearch(int[] arr ,int s,int e,int target,boolean flag){
        if(s<=e){
            int mid =s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }else{
                if(target > arr[mid]){
                    if(flag==true)    
                        return orderAgnosticBinarySearch(arr, mid+1, e, target,flag);
                    else
                        return orderAgnosticBinarySearch(arr, s, mid-1, target,flag);
                }else{
                   if(flag==true)    
                        return orderAgnosticBinarySearch(arr, s, mid-1, target,flag);
                    else
                        return orderAgnosticBinarySearch(arr, mid+1, e, target,flag);
                }
            }
        }
        return -1;
    }
}
