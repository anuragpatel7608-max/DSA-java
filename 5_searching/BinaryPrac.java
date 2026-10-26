public class BinaryPrac{
    public static void main(String[] args) {
        int[] arr ={-12,-4,-1,0,1,2,6,7,8,9};
        int target =2;
        int res=binarySearch(arr, 0, arr.length -1, target);
        System.out.println(target+" found in index : "+res);
    }

    static int binarySearch(int[] arr ,int s,int e,int target){
        if(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else{
                if(target > arr[mid]){
                   return binarySearch(arr, mid+1, e, target);
                }else{
                   return binarySearch(arr, s, mid-1, target);
                }
            }
        }
        return -1;
    }
}